public abstract class InstrumentoDeCorda extends Instrumento {
    
    private String tipoCorda;

    InstrumentoDeCorda(String tom, int tamanho, String tipoCorda) {
        super(tom, tamanho);
        this.tipoCorda = tipoCorda;
    }

    
    @Override
    abstract void tocar();



}
