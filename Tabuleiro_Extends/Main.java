import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    

    public static void tabuleiro(int largura, int altura, List<Personagem> pers){
        for (int lin = 0; lin < altura; lin++) {
            for (int col = 0; col < largura; col++) {

                boolean tevePersonagem = false;
                for (Personagem p : pers) {
                    if(lin == p.getPosY() && col == p.getPosX()){
                        tevePersonagem = true;   
                        System.out.print("[ "  + p.desenhar() + " ]"); 
                        break;
                    } 
                }

                if(!tevePersonagem) {
                    System.out.print("[ . ]");
                }
                
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {

        List<Personagem> pers = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);


        pers.add(new Player(0, 0, "X"));
        pers.add(new Inimigo(1, 1, "U"));
        pers.add(new Player(0, 0, "X"));
        pers.add(new Inimigo(2, 2, "U"));


        while (true) {
            tabuleiro(5, 5, pers);

            System.out.println("-----");
            
            for (int i = 0; i < pers.size(); i++) {
                System.out.println(i + " - " + pers.get(i).getDesenho());
            }
            
            System.out.println("-----");
            
            System.out.println("Per: ");
            int per = Integer.parseInt(leitor.nextLine());
            
            System.out.println("Dir: ");
            int dir = Integer.parseInt(leitor.nextLine());

            pers.get(per).mover(dir);

        }
        

    }

}
