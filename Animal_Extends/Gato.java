public class Gato extends Animal {
    
    private String pelagem;
    private boolean cacando;

    public void mudarCacando(){
        
        // < > = == !=
        // if(!false)
        // this.cacando = !this.cacando;
        this.setCacando(!this.getCacando());
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau Meow");        
    }

    public void setPelagem(String pelagem){
        this.pelagem = pelagem;
    }

    public void setCacando(boolean cacando){
        this.cacando = cacando;
    }

    public String getPelagem(){
        return pelagem;
    }

    public boolean getCacando(){
        return cacando;
    }

}
