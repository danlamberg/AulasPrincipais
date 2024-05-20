import java.time.LocalDate;

public class ContatoPessoal extends Contato {
    private LocalDate dataNascimento;

    public ContatoPessoal(String nome, String telefone, LocalDate dataNascimento) {
        super(nome, telefone);
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Data de Nascimento: " + dataNascimento;
    }
}
