public abstract class Instrumento {
    
    private String tom;
    private int tamanho;

    Instrumento(String tom, int tamanho){
        this.tom = tom;
        this.tamanho = tamanho;
    }

    abstract void tocar();
    //System.out.println("Tocando Instrumento...");

}
