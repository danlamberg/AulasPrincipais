public class Animal {
    
    private String nome;
    private String sexo;
    private int idade;


    public void envelhecer(){
        // this.idade += 1;
        this.setIdade(this.getIdade() + 1);
    }

    public void emitirSom(){
        System.out.println("O animal está fazendo barulho...");
    }

    
    @Override
    public String toString() {
        return "Animal - [nome=" + this.getNome() 
        + "] - [sexo=" + this.getSexo() 
        + "] - [idade="+ this.getIdade() +"]";
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSexo(){
        return this.sexo;
    }

    public int getIdade(){
        return this.idade;
    }
}
