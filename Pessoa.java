package Gym.Company1;

public class Pessoa {

    // Atributos de instância
    private String nome;
    private String sobreNome;
    private String ultimoNome;
    private Data dataNascimento;
    private String rg;

    // Construtor
    public Pessoa(String nome, String sobreNome, String ultimoNome, int dia, int mes, int ano, String rg) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.ultimoNome = ultimoNome;
        dataNascimento = new Data ( dia, mes, ano );
        this.rg = rg;
    }

    public Pessoa() {
    }

    // Métodos GET e SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString (){
        return "Nome Completo: " + this.getNome()+ " " + this.getSobreNome() +
                " " + this.getUltimoNome()+
                "\nData de Nascimento: "+this.dataNascimento.imprimirData()+
                ".\nRegistro Geral: " + this.getRg();
    }

} // Fim da classe Pessoa
