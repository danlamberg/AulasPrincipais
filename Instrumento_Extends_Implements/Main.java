public class Main {
    public static void main(String[] args) {
     
        // Instrumento i = new Instrumento("D", 20);
        // InstrumentoDeCorda ic = new InstrumentoDeCorda("", 2, "");
        Violao v = new Violao("E", 20, "corda", 5);
        Flauta f = new Flauta("F", 5, "plastico");
        Guitarra g = new Guitarra("G", 40, "sla");
        Trompete t = new Trompete("A", 10, "null");
        // InstrumentoDeSopro is = new InstrumentoDeSopro("null", 0, "null");

        // i.tocar();
        v.tocar();
        f.tocar();

        v.tocarAcordes();
        f.tocarMelodia();
        
        // f.tocarAcordes();
        // v.tocarMelodia();

        v.afinar();
        v.mudarOTom("G");

        t.afinar();
        t.tocar();
        t.mudarOTom("C");

        g.tocar();
        //g.afinar();
        //g.mudarOTom("F");

        

        /*
         * Guitarra -> numeroDeCaptadores -- tocarSolo() -- Afinador
         * InstrumentoDeSopro -> materialDeConstrução -- limpar() -- Afinador
         * Trompete -> numeroValvulas;
         * 
         * 
         */

    }

}
