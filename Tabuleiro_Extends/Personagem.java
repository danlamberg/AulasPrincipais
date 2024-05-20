public class Personagem {
 
    private int posX;
    private int posY;
    private String desenho;
    
    Personagem(int posX, int posY, String desenho){
        this.posX = posX;
        this.posY = posY;
        this.desenho = desenho;        
    }


    String desenhar(){
        return this.desenho;
    }


    void mover(int dir){

        switch (dir) {
            case 1:
                this.posY -= 1;
                break;

            case 2:
                this.posY += 1;
                break;

            case 3:
                this.posX -= 1;
                break;

            case 4:
                this.posX += 1;
                break;
        
            default:
                break;
        }

    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getDesenho() {
        return desenho;
    }

    public void setDesenho(String desenho) {
        this.desenho = desenho;
    }

}
