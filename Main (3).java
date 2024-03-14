import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nOpções:");
            System.out.println("[0] - Sair");
            System.out.println("[1] - Cadastrar");
            System.out.println("[2] - Pesquisar");
            System.out.println("[3] - Alterar");
            System.out.println("[4] - Excluir");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrar(scanner);
                    break;
                case 2:
                    pesquisar(scanner);
                    break;
                case 3:
                    alterar(scanner);
                    break;
                case 4:
                    excluir(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }

    static void cadastrar(Scanner scanner) {
        System.out.print("Digite o nome: ");
        OperacoesCRUD.nomes[OperacoesCRUD.tamanho] = scanner.next();

        System.out.print("Digite o telefone: ");
        OperacoesCRUD.telefones[OperacoesCRUD.tamanho] = scanner.next();

        OperacoesCRUD.tamanho++;

        System.out.println("Registro cadastrado com sucesso!");
    }

    static void pesquisar(Scanner scanner) {
        System.out.print("Digite o nome a ser pesquisado: ");
        String nomePesquisa = scanner.next();

        for (int i = 0; i < OperacoesCRUD.tamanho; i++) {
            if (OperacoesCRUD.nomes[i].equalsIgnoreCase(nomePesquisa)) {
                System.out.println("Nome: " + OperacoesCRUD.nomes[i] + " | Telefone: " + OperacoesCRUD.telefones[i]);
                return;
            }
        }

        System.out.println("Registro não encontrado.");
    }

    static void alterar(Scanner scanner) {
        System.out.print("Digite o nome do registro a ser alterado: ");
        String nomeAlteracao = scanner.next();

        for (int i = 0; i < OperacoesCRUD.tamanho; i++) {
            if (OperacoesCRUD.nomes[i].equalsIgnoreCase(nomeAlteracao)) {
                System.out.print("Digite o novo nome: ");
                OperacoesCRUD.nomes[i] = scanner.next();

                System.out.print("Digite o novo telefone: ");
                OperacoesCRUD.telefones[i] = scanner.next();

                System.out.println("Registro alterado com sucesso!");
                return;
            }
        }

        System.out.println("Registro não encontrado.");
    }

    static void excluir(Scanner scanner) {
        System.out.print("Digite o nome do registro a ser excluído: ");
        String nomeExclusao = scanner.next();

        for (int i = 0; i < OperacoesCRUD.tamanho; i++) {
            if (OperacoesCRUD.nomes[i].equalsIgnoreCase(nomeExclusao)) {
                for (int j = i; j < OperacoesCRUD.tamanho - 1; j++) {
                    OperacoesCRUD.nomes[j] = OperacoesCRUD.nomes[j + 1];
                    OperacoesCRUD.telefones[j] = OperacoesCRUD.telefones[j + 1];
                }
                OperacoesCRUD.tamanho--;
                System.out.println("Registro excluído com sucesso!");
                return;
            }
        }

        System.out.println("Registro não encontrado.");
    }
}
