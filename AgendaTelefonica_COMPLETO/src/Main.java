import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        AgendaTelefonica agenda = new AgendaTelefonica();

        int opcao;
        do {
            System.out.println("\nInforme a opção desejada: ");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover contato");
            System.out.println("0 - Sair");

            opcao = leitor.nextInt();
            leitor.nextLine(); 

            switch (opcao) {
                case 1:
                    agenda.adicionar();
                    break;
                case 2:
                    agenda.listar();
                    break;
                case 3:
                    agenda.buscarContatos();
                    break;
                case 4:
                    agenda.remover();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        } while (opcao != 0);

        leitor.close();
    }
}
