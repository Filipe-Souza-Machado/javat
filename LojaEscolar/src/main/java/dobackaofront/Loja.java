package dobackaofront;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Produto> produtos = new ArrayList<>();



    public void adicionarProdutos(Produto produto){
        produtos.add(produto);
    }

    public void listarProdutos(){
        for(Produto p: produtos){
            p.exibirDetalhes();
        }
    }
}
