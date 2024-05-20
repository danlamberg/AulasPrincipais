public final class Flauta implements Afinador {

    
    Flauta(String tom, int tamanho, String materialDeConstrucao) {
        
    }

    void tocar() {
        System.out.println("Tocando Flauta...");
    }
    
    void tocarMelodia(){
        System.out.println("tururururuuuuu");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando Flauta...");
    }

    @Override
    public void mudarOTom(String tom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mudarOTom'");
    }
    

}
