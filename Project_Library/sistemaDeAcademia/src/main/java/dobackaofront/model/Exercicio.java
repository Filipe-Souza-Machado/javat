package dobackaofront.model;

public class Exercicio {

    private String nome;
    private int quantidadeRepeticoes;
    private int carga;

    public Exercicio(String nome, int quantidadeRepeticoes, int carga) {
        this.nome = nome;
        this.quantidadeRepeticoes = quantidadeRepeticoes;
        this.carga = carga;
    }

    public Exercicio(String nome){
        this.nome = nome;
        this.quantidadeRepeticoes = 0;
        this.carga = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeRepeticoes() {
        return quantidadeRepeticoes;
    }

    public void setQuantidadeRepeticoes(int quantidadeRepeticoes) {
        this.quantidadeRepeticoes = quantidadeRepeticoes;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
