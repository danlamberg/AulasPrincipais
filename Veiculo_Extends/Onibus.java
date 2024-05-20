public class Onibus extends Veiculo {
    
    private int capacidadePassageiros;
    private String[] portasAcesso;
    private String[] rotasItinerarios;
    
    // Métodos getters e setters para os atributos
    
    public Onibus(String modelo, int ano, String cor, int capacidadePassageiros, String[] portasAcesso, String[] rotasItinerarios) {
        super(modelo, ano, cor);
        this.capacidadePassageiros = capacidadePassageiros;
        this.portasAcesso = portasAcesso;
        this.rotasItinerarios = rotasItinerarios;
    }

    public void abrirPortaDianteira() {
        // Implementação específica para abrir a porta dianteira do ônibus
    }
    
    public void anunciarParadaProxima() {
        // Implementação específica para anunciar a próxima parada do ônibus aos passageiros
    }






    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String[] getPortasAcesso() {
        return portasAcesso;
    }

    public void setPortasAcesso(String[] portasAcesso) {
        this.portasAcesso = portasAcesso;
    }

    public String[] getRotasItinerarios() {
        return rotasItinerarios;
    }

    public void setRotasItinerarios(String[] rotasItinerarios) {
        this.rotasItinerarios = rotasItinerarios;
    }
}
