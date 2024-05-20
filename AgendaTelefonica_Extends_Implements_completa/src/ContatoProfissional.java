public class ContatoProfissional extends Contato {

    private String email;
    
    public ContatoProfissional(String nome, int telefone, String email) {
        super(nome, telefone);
        this.email = email;
        
    }

    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return super.toString() + ", Email: " + email;
    }

    
   
}
