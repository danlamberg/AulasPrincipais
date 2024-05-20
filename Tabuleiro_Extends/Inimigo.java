public class Inimigo extends Personagem {

    Inimigo(int posX, int posY, String desenho) {
        super(posX, posY, desenho);
    }

    @Override
    String desenhar() {
        return "\u001B[31m" + this.getDesenho() + "\u001B[0m";
    }
    
}