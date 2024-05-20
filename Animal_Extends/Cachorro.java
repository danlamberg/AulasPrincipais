public class Cachorro extends Animal {
    
    private String raca;
    private String porte;


    public void buscarOsso(){
        System.out.println("au.. au.. Cade osso.. cade..  ruff ruff..");
    }


    @Override
    public void emitirSom() {
        System.out.println("au au");
    }

    @Override
    public String toString() {
        return "Cachorro - [nome=" + this.getNome()
        + "] - [sexo=" + this.getSexo() 
        + "] - [idade="+ this.getIdade()
        + "] - [raça=" + this.getRaca() 
        + "] - [porte=" + this.getPorte() + "]";
    }


    public void setRaca(String raca){
        this.raca = raca;
    }

    public void setPorte(String porte){
        this.porte = porte;
    }

    public String getRaca(){
        return this.raca;
    }

    public String getPorte(){
        return this.porte;
    }

}
