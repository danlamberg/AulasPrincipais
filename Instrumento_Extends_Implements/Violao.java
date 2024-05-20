public class Violao extends InstrumentoDeCorda implements Afinador {

    private int numeroDeCordas;

    Violao(String tom, int tamanho, String tipoCorda, int numeroDeCordas) {
        super(tom, tamanho, tipoCorda);
        this.numeroDeCordas = numeroDeCordas;
    }

    @Override
    void tocar() {
       System.out.println("Tocando Violao...");
    }

    void tocarAcordes(){
        System.out.println("Bleumm...");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Violão...");
    }

    @Override
    public void mudarOTom(String tom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mudarOTom'");
    }
    
    

}
