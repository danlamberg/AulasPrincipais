public class Player extends Personagem {

    Player(int posX, int posY, String desenho) {
        super(posX, posY, desenho);
    }



    @Override
    String desenhar() {
        return "\u001B[32m" + this.getDesenho() + "\u001B[0m";
    }
    


}


