public class Carro extends Veiculo {
    
   
    private int numeroPortas;
    private String tipoTransmissao;
    private float capacidadePortaMalas;
    
    

    public Carro(String modelo, int ano, String cor, int numeroPortas, String tipoTransmissao, float capacidadePortaMalas) {
        super(modelo, ano, cor);

        this.numeroPortas = numeroPortas;
        this.tipoTransmissao = tipoTransmissao;
        this.capacidadePortaMalas = capacidadePortaMalas;
    }


    // Métodos getters e setters para os atributos
    
    public void ligarFarolNeblina() {
        System.out.println("ligar o farol de neblina do carro");
    }
    
    public void abrirTetoSolar() {
        System.out.println("abrir o teto solar do carro");
    }



    // Métodos getters e setters para os atributos

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getTipoTransmissao() {
        return tipoTransmissao;
    }

    public void setTipoTransmissao(String tipoTransmissao) {
        this.tipoTransmissao = tipoTransmissao;
    }

    public float getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(float capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

}