import java.util.ArrayList;
import java.util.List;

public class Main {


    public void mandarTrabalhar(List<Trabalhavel> funcionariosTrabalho){
        for (int i = 0; i < funcionariosTrabalho.size(); i++) {
            funcionariosTrabalho.get(i).trabalhar();
        }
    }
    
    public void calcularSalarios(List<Funcionario> funcionarios){

        for (int i = 0; i < funcionarios.size(); i++) {
            funcionarios.get(i).calcularSalario();
            
            if(funcionarios.get(i).getClass() == Estagiario.class){
                Estagiario aux = (Estagiario) funcionarios.get(i);
                aux.pegarCafe();
                aux.pegarCafe(10.0f);
                aux.pegarCafe(10.0f, 10);
            }


        }

    }


    public static void main(String[] args) {
        
        // Funcionario fun = new Funcionario();
        Gerente ge = new Gerente();
        Estagiario es = new Estagiario();
        Desenvolvedor de = new Desenvolvedor();

        ge.calcularSalario();
        es.calcularSalario();
        // es.pegarCafe();
        de.calcularSalario();

        // es.pegarCafe();

        Estagiario aux = (Estagiario) es;
        aux.pegarCafe();

        aux.pegarCafe();
        aux.pegarCafe(80.0f);
        aux.pegarCafe(80.0f, 10);


        ge.trabalhar();
        de.trabalhar();
        // es.trabalhar();

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(de);
        funcionarios.add(ge);
        funcionarios.add(es);


        List<Trabalhavel> funcionariosQueTrabalham = new ArrayList<>();
        funcionariosQueTrabalham.add(de);
        funcionariosQueTrabalham.add(ge);
        // funcionariosQueTrabalham.add(es);


    }


}