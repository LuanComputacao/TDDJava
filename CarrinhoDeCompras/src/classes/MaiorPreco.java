package classes;

/**
 * Created by luan on 20/03/15.
 */
public class MaiorPreco {
    public double encontra(CarrinhoDeCompras carrinho) {
        int sizeCarrinho = carrinho.getItens().size();
        
        if ( sizeCarrinho == 0) return 0;

        double maior = carrinho.getItens().get(0).getQuantidade();
        for (Item item : carrinho.getItens()) {
            if (maior < item.getValorTotal()) {
                maior = item.getValorTotal();
            }
        }
        
        return carrinho.getItens().get(0).getValorTotal();
    }
}
