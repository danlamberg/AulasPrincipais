public class ContatoPessoal extends Contato {
    
    private String dataNascimento;

    public ContatoPessoal(String nome, int telefone, String dataNascimento) {
        super(nome, telefone);
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
       return super.toString() + ", Data de Nascimento: " + dataNascimento;
    }
}
