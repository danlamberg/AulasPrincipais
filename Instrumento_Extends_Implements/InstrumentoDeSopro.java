public abstract class InstrumentoDeSopro extends Instrumento implements Afinador {

    private String materialDeConstrucao;

    InstrumentoDeSopro(String tom, int tamanho, String materialDeConstrucao) {
        super(tom, tamanho);
        this.materialDeConstrucao = materialDeConstrucao;
    }

    @Override
    void tocar() {
        System.out.println("Tocando Instrumento de Sopro...");
    }
    
    void limpar(){
        System.out.println("Limpando Instrumento de Sopro...");
    }

    @Override
    public void afinar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'afinar'");
    }

    @Override
    public void mudarOTom(String tom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mudarOTom'");
    }
    

}
