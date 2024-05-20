public class Main{

    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        animal.setNome("Animalus Planetarus");
        animal.setIdade(10000);
        animal.setSexo("M");

        cachorro.setPorte("Medio");
        cachorro.setRaca("Caramelo");
        cachorro.setNome("Walder");
        cachorro.setIdade(7);
        cachorro.setSexo("M");

        cachorro.buscarOsso();

        gato.setNome("Clébersú");
        gato.setIdade(5);
        gato.setSexo("M");
        gato.envelhecer();
        gato.emitirSom();
        // gato.buscarOsso();

        vaca.setNome("Gertudes");
        vaca.setIdade(10);
        vaca.setSexo("F");
        vaca.setDieta("pasto");
        vaca.setManchas("Marrom");


        System.out.println(animal);
        System.out.println(cachorro);
        System.out.println(gato);
        System.out.println(vaca);

        animal.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();
        vaca.emitirSom();


    }

}