package dobackaofront;

public class Estojo extends Produto implements Desconto{

    public Estojo(String nome, double preco) {
        super(nome, preco);
    }


    @Override
    public double aplicarDesconto(double percentual) {
        return getPreco() - (getPreco()*(percentual/100));
    }
}
