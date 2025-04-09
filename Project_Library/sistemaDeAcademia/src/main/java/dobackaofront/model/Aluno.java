package dobackaofront.model;

public class Aluno {

    //
    private String nome;
    private String dataMatricula;
    private double peso;
    private double altura;

    private double cintura;
    private double biceps;
    private double peitoral;
    private char sexo;

    //Construtor aluno ------------------------------------------------------------------------------------------------------------------------------
    public Aluno(String nome, String dataMatricula, double peso, double altura, double cintura, double biceps, double peitoral, char sexo) {
        this.nome = nome;
        this.dataMatricula = dataMatricula;
        this.peso = peso;
        this.altura = altura;
        this.cintura = cintura;
        this.biceps = biceps;
        this.peitoral = peitoral;
        this.sexo = sexo;
    }

    //Construtor aluno -----------------------------------------------------------------------------------------------------------------------------
    public Aluno(String nome, String dataMatricula, char sexo){
        this.nome = nome;
        this.dataMatricula = dataMatricula;
        this.sexo = sexo;

        this.peso = 0;
        this.altura = 0;
        this.cintura = 0;
        this.biceps = 0;
        this.peitoral = 0;
    }

    // Gets e sets -----------------------------------------------------------------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getCintura() {
        return cintura;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

    public double getBiceps() {
        return biceps;
    }

    public void setBiceps(double biceps) {
        this.biceps = biceps;
    }

    public double getPeitoral() {
        return peitoral;
    }

    public void setPeitoral(double peitoral) {
        this.peitoral = peitoral;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", dataMatricula='" + dataMatricula + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", cintura=" + cintura +
                ", biceps=" + biceps +
                ", peitoral=" + peitoral +
                ", sexo=" + sexo +
                '}';
    }
}
