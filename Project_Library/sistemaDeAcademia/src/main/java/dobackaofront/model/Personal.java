package dobackaofront.model;

public class Personal {
    private String nome;
    private String whatsaap;

    public Personal(String nome, String whatsaap) {
        this.nome = nome;
        this.whatsaap = whatsaap;
    }

    public Personal(){
        this.nome = "";
        this.whatsaap = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getWhatsaap() {
        return whatsaap;
    }

    public void setWhatsaap(String whatsaap) {
        this.whatsaap = whatsaap;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "nome='" + nome + '\'' +
                ", whatsaap='" + whatsaap + '\'' +
                '}';
    }
}
