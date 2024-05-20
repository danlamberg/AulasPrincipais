public class Estagiario extends Funcionario {
    

    void pegarCafe(){
        System.out.println("Buscando meu café...");
    }

    void pegarCafe(float tamanho){
        System.out.println("Buscando meu café de " + tamanho + "ml");
    }

    void pegarCafe(float tamanho, int pessoal){
        System.out.println("Buscando café de " + tamanho + "ml pra " + pessoal + " pessoas");
    }
    


    @Override
    public void calcularSalario() {
        float salarioFinal = (salario * 12);
    }

}
