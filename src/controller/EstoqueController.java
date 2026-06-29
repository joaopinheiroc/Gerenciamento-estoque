package controller;

import service.EstoqueService;
import view.TerminalView;
import model.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class EstoqueController {
    private EstoqueService service = new EstoqueService();
    private TerminalView view = new TerminalView();

    public void iniciarSistema() {
        int opcao = -1;
    
        do {
            view.exibirMenu();
            opcao = view.lerOpcao();

            try {
                switch (opcao) {
                    case 1:
                        cadastrar();
                        break;
                    case 2:
                        List<Produto> listadeProdutos = service.listarProdutos();
                        view.exibirListaDeProdutos(listadeProdutos);
                        break;
                    case 3:
                        int idBusca = view.lerInteiro("ID do produto: ");
                        Produto produtoEncontrado = service.buscarProdutoPorId(idBusca);
                        view.exibirDetalhesProduto(produtoEncontrado);
                        break;
                    case 4:
                        int idEntrada = view.lerInteiroPositivo("ID: ");
                        int qtdEntrada = view.lerInteiroPositivo("Quantidade: ");
                        service.darEntradaEstoque(idEntrada, qtdEntrada);
                        view.exibirMensagem("Entrada realizada com sucesso");
                        break;
                    case 5:
                        int idSaida = view.lerInteiroPositivo("ID: ");
                        int qtdSaida = view.lerInteiroPositivo("Quantidade a ser removida: ");
                        service.darSaidaEstoque(idSaida, qtdSaida);
                        view.exibirMensagem("Saída realizada!");
                        break;
                    case 0:
                        view.exibirMensagem("Encerrando o sistema...");
                        break;
                    default:
                        view.exibirMensagem("Opção inválida.");
                
                    }
                } catch (Exception erro) {
                    view.exibirMensagem("Erro:" + erro.getMessage());
                }

            } while (opcao != 0);
        }

        private void cadastrar() {
            int tipo = view.lerInteiro("1-Eletrônico, 2-Perecível: ");
            int id = view.lerInteiroPositivo("ID: ");
            if(service.existeProdutoComId(id)) {
                throw new IllegalArgumentException(" o ID " + id + " Já está em uso!");
            }
            String nome = view.lerString("Nome: ");
            double preco = view.lerDoublePositivo("Preço: ");
            int qtd = view.lerInteiroPositivo("Quantidade: ");

            String nomeCategoria = view.lerString("Categoria: ");
            Categoria cat =  new Categoria(nomeCategoria); 

            String nomeFornecedor = view.lerString("Fornecedor: ");
            String telefoneFornecedor = view.lerString("Telefone do fornecedor: ");
            Fornecedor forn = new Fornecedor(nomeFornecedor, telefoneFornecedor);

            if (tipo == 1) {
                int garantia = view.lerInteiro("Garantia em meses: ");
                ProdutoEletronico eletronico =  new ProdutoEletronico(id, nome, preco, qtd, cat, forn, garantia);
                service.adicionarProduto(eletronico);
                view.exibirMensagem("Produto eletrônico cadastrado!");
            }
            else if (tipo == 2) {
                String dataString = view.lerString("Validade (DD/MM/AAAA)");
                DateTimeFormatter formatoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataValidade = LocalDate.parse(dataString, formatoBrasileiro);

                ProdutoPerecivel perecivel = new ProdutoPerecivel(id, nome, preco, qtd, cat, forn, dataValidade);
                service.adicionarProduto(perecivel);
                view.exibirMensagem("Produto perecível Cadastrado!");
            } else {
                view.exibirMensagem("Tipo inválido!");
            }
        }
    }

