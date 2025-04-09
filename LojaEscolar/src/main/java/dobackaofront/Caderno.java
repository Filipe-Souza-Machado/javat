package dobackaofront;

public class Caderno extends Produto{

    private int numeroDeFolhas;

    public Caderno(String nome, double preco, int numeroDeFolhas) {
        super(nome, preco);
        this.numeroDeFolhas = numeroDeFolhas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Caderno: "+getNome()+ "\n Numero de folhas: "+numeroDeFolhas+ " Preço: R$"+getPreco());
    }
}
