package Gym.Company1;

public class Aluno extends Pessoa {

    // Atributos de instãncia
    private String matricula;
    private String tipoAluno;

    // Construtor
    public Aluno(String matricula, String tipoAluno,
                 String nome, String sobreNome, String ultimoNome, int dia, int mes, int ano,
                 String rg) {
        super(nome, sobreNome, ultimoNome, dia, mes, ano, rg);
        this.matricula = matricula;
        this.tipoAluno = tipoAluno;
    }

    public Aluno() {
    }

    // Métodos GET e SET
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipoAluno() {
        return tipoAluno;
    }

    public void setTipoAluno(String tipoAluno) {
        this.tipoAluno = tipoAluno;
    }

    @Override
    public String toString (){
        return super.toString()+
                "\nNumero de Matricula: " + this.getMatricula() +
                "\nTipo de Aluno: " + this.getTipoAluno() ;
    }

} // Fim da classe Aluno
