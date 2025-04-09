package dobackaofront;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Loja loja= new Loja();

        Caderno caderno = new Caderno("Caderno universitario", 20.0, 200);
        Estojo estojo = new Estojo("Estojo artistico" , 15.0);

        loja.adicionarProdutos(caderno);
        loja.adicionarProdutos(estojo);

        System.out.println(" === Lista de produtos cadastrados ===");

        loja.listarProdutos();

        System.out.println("\n=== Aplicando desconto ===");
        double novoPreco = estojo.aplicarDesconto(10);

        System.out.println("Novo preço do estojo ");
    }
}
