import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AgendaTelefonica implements OperacoesAgenda {
    
    private List<Contato> contatos;
    private Scanner scanner;

    public AgendaTelefonica(){
        contatos = new ArrayList<Contato>();
        scanner = new Scanner(System.in);
    }

    @Override
    public void adicionar() {
        System.out.println("Escolha o tipo de contato: ");
        System.out.println("1 - Contato");
        System.out.println("2 - Contato Profissional");
        System.out.println("3 - Contato Pessoal");
        int tipoContato = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        int telefone = scanner.nextInt();
        scanner.nextLine(); 

        if (tipoContato == 1) {
            Contato contato = new Contato(nome, telefone);
            contatos.add(contato);
        } else if (tipoContato == 2) {
            System.out.print("Email: ");
            String email = scanner.nextLine();
            ContatoProfissional contatoProfissional = new ContatoProfissional(nome, telefone, email);
            contatos.add(contatoProfissional);
        } else if (tipoContato == 3) {
            String dataNascimentoStr = "";
            LocalDate dataNascimento = null;
            boolean dataValida = false;

            while (!dataValida) {
                try {
                    System.out.print("Data de Nascimento (YYYY-MM-DD): ");
                    dataNascimentoStr = scanner.nextLine();
                    dataNascimento = LocalDate.parse(dataNascimentoStr);
                    dataValida = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Formato de data inválido. Por favor, insira a data no formato YYYY-MM-DD.");
                }
            }

            ContatoPessoal contatoPessoal = new ContatoPessoal(nome, telefone, dataNascimentoStr);
            contatos.add(contatoPessoal);
        }
    }

    @Override
    public void buscarContatos() {
        System.out.print("Nome do contato a ser buscado: ");
        String nomeBuscar = scanner.nextLine();
        Contato contato = null;
        for (Contato c : contatos) {
            if (c.getNome().equals(nomeBuscar)) {
                contato = c;
                break;
            }
        }
        if (contato != null) {
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    @Override
    public void listar() {
        if (contatos.isEmpty()) {
            System.out.println("Nenhum contato encontrado.");
        } else {
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }

    @Override
    public void remover() {
        System.out.print("Nome do contato a ser removido: ");
        String nomeRemover = scanner.nextLine();
        contatos.removeIf(contato -> contato.getNome().equals(nomeRemover));
    }
}
