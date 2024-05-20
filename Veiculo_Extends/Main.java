public class Main {
 
    public static void main(String[] args) {
        
        Veiculo v =   new Veiculo("VE07", 1900, "azul");
        Carro c =     new Carro("CA982", 2000, "bw", 4, "", 400);
        Moto m =      new Moto(null, 0, null, 0, null, null);
        Onibus o    = new Onibus(null, 0, null, 0, args, args)
        Bicicleta b = new Bicicleta(null, 0, null, 0, null, null)
        
        v.ligar();
        v.acelerar();
        v.frear();
        v.virar();
        v.desligar();

        System.out.println("--");
        c.ligar();
        c.acelerar();
        c.frear();
        c.virar();
        c.desligar();
        c.ligarFarolNeblina();
        c.abrirTetoSolar();

        




    }

}
