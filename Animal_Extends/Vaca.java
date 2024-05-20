public class Vaca extends Animal {

    private String dieta;
    private String manchas;

    public void pastar(){
        System.out.println("hmmm.. grama boua...");
    }
    
    public void produzirLeite(){
        System.out.println("produzindo leite");
    }

    public void setManchas(String manchas){
        this.manchas = manchas;
    }

    public void setDieta(String dieta){
        this.dieta = dieta;
    }

    public String getManchas(){
        return this.manchas;
    }

    public String getDieta(){
        return this.dieta;
    }

    
}
