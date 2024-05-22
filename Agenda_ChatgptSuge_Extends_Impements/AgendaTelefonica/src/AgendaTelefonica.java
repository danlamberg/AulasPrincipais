import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica implements OperacoesAgenda {
    private List<Contato> contatos;

    public AgendaTelefonica() {
        contatos = new ArrayList<>();
    }

    @Override
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    @Override
    public void removerContato(String nome) {
        contatos.removeIf(contato -> contato.getNome().equals(nome));
    }

    @Override
    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    @Override
    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }
}
