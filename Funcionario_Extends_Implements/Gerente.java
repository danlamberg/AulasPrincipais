public class Gerente extends Funcionario implements Trabalhavel {

    float bonus;
    
    @Override
    public void calcularSalario() {
        float salarioFinal = (salario * 12) + bonus;
    }
    
    public void calcularOutroSalario(){
        float salarioFinal = (salario * 12) + bonus;
    }

    public void calcularOutroSalario(float bonus2){
        float salarioFinal = (salario * 12) + bonus + bonus2;
    }

    public void calcularOutroSalario(int meses){
        float salarioFinal = (salario * meses) + bonus;
    }

    public float calcularOutroSalario(int meses, int bonus2){
        return (salario * meses) + bonus;
    }

    @Override
    public void trabalhar() {
        
    }

    @Override
    public void relatarProgresso() {
        
    }

    
    
}
