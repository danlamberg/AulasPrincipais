public class Trompete extends InstrumentoDeSopro {

    private int numeroDeValvulas;

    Trompete(String tom, int tamanho, String materialDeConstrucao) {
        super(tom, tamanho, materialDeConstrucao);
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Trompete...");
    }

    @Override
    public void mudarOTom(String tom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mudarOTom'");
    }
    

    

}
