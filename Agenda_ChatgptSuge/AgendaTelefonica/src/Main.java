import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Listar Contatos");
            System.out.println("4. Buscar Contato");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo de contato:");
                    System.out.println("1. Contato");
                    System.out.println("2. Contato Profissional");
                    System.out.println("3. Contato Pessoal");
                    int tipoContato = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    if (tipoContato == 1) {
                        Contato contato = new Contato(nome, telefone);
                        agenda.adicionarContato(contato);
                    } else if (tipoContato == 2) {
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        ContatoProfissional contatoProfissional = new ContatoProfissional(nome, telefone, email);
                        agenda.adicionarContato(contatoProfissional);
                    } else if (tipoContato == 3) {
                        System.out.print("Data de Nascimento (YYYY-MM-DD): ");
                        String dataNascimentoStr = scanner.nextLine();
                        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);
                        ContatoPessoal contatoPessoal = new ContatoPessoal(nome, telefone, dataNascimento);
                        agenda.adicionarContato(contatoPessoal);
                    }
                    break;

                case 2:
                    System.out.print("Nome do contato a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;

                case 3:
                    agenda.listarContatos();
                    break;

                case 4:
                    System.out.print("Nome do contato a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    Contato contato = agenda.buscarContato(nomeBuscar);
                    if (contato != null) {
                        System.out.println(contato);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    scanner.close();
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
