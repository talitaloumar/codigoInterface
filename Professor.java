package Gym.Company1;

public class Professor extends Pessoa {

    // Atributos de instância
    private String especialidade;
    private double salario;

    // Construtor
    public Professor(String especialidade, double salario) {
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Professor() {
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString (){
        return super.toString()+
                "\nEspecialidade: "+this.getEspecialidade()+
                "\nSalario: "+this.getSalario();
    }

}// Fim da classe Professor