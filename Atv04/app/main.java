package Atv04.app;

import java.util.Scanner;
import Atv04.controller.ClienteController;
import Atv04.controller.OrdemServicoController;
import Atv04.controller.TecnicoController;
import Atv04.model.EnumEquipamento;
import Atv04.model.EnumStatusOS;
import Atv04.service.ClienteService;
import Atv04.service.OrdemServicoService;
import Atv04.service.TecnicoService;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Services
        ClienteService clienteService = new ClienteService();
        TecnicoService tecnicoService = new TecnicoService();
        OrdemServicoService ordemService = new OrdemServicoService();

        // Controllers
        ClienteController clienteController =
                new ClienteController(clienteService);

        TecnicoController tecnicoController =
                new TecnicoController(tecnicoService);

        OrdemServicoController ordemController =
                new OrdemServicoController(ordemService);

        int opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Atualizar Cliente");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Cadastrar Técnico");
            System.out.println("5 - Atualizar Técnico");
            System.out.println("6 - Criar Ordem de Serviço");
            System.out.println("7 - Atualizar Status da OS");
            System.out.println("8 - Listar Ordens de Serviço");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Nome do cliente: ");
                    String nomeCliente = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    clienteController.CadastrarCliente(nomeCliente, telefone);
                    break;

                case 2:
                    System.out.print("ID do cliente: ");
                    int idCliente = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Novo nome (ENTER para ignorar): ");
                    String novoNome = scanner.nextLine();

                    System.out.print("Novo telefone (ENTER para ignorar): ");
                    String novoTelefone = scanner.nextLine();

                    clienteController.atualizarTecnico(idCliente, novoNome, novoTelefone);
                    
                    break;

                case 3:
                    clienteService.listaCliente();
                    break;

                case 4:
                    System.out.print("Nome do técnico: ");
                    String nomeTecnico = scanner.nextLine();

                    System.out.print("Especialidade (NOTEBOOK, CELULAR, TV): ");
                    EnumEquipamento especialidade =
                            EnumEquipamento.valueOf(scanner.nextLine().toUpperCase());

                    tecnicoController.cadastrarTecnico(nomeTecnico, especialidade);
                    break;

                case 5:
                    System.out.print("ID do técnico: ");
                    int idTecnico = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Novo nome (ENTER para ignorar): ");
                    String nomeTec = scanner.nextLine();

                    System.out.print("Nova especialidade (ENTER para ignorar): ");
                    String esp = scanner.nextLine();

                    EnumEquipamento novaEspecialidade =
                            esp.isBlank() ? null : EnumEquipamento.valueOf(esp.toUpperCase());

                    tecnicoController.atualizarTecnico(
                            idTecnico,
                            nomeTec.isBlank() ? null : nomeTec,
                            novaEspecialidade
                    );
                    break;

                case 6:
                    System.out.print("ID do cliente: ");
                    int clienteId = scanner.nextInt();

                    System.out.print("ID do técnico: ");
                    int tecnicoId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Equipamento: ");
                    String equipamento = scanner.nextLine().toUpperCase();
                    EnumEquipamento equip = EnumEquipamento.valueOf(equipamento); 

                    System.out.print("Descrição do problema: ");
                    String descricao = scanner.nextLine();

                    break;

                case 7:
                    System.out.print("Número da OS: ");
                    int numeroOS = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Novo status (ABERTA, EM_ANDAMENTO, FINALIZADA, CANCELADA): ");
                    EnumStatusOS status =   EnumStatusOS.valueOf(scanner.nextLine().toUpperCase());

                    ordemController.atualizarOrdemServico(numeroOS, "", null, status, null);
                    break;

                case 8:
                    ordemService.listaOrdemServico();;
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}