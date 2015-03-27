package tests.dataBuilders;

import classes.CarrinhoDeCompras;
import classes.Item;

/**
 *
 */
public class CarrinhoDeComprasBuilder {
    public CarrinhoDeCompras carrinho;

    public CarrinhoDeComprasBuilder() {
        this.carrinho = new CarrinhoDeCompras();
    }

    /**
     *
     * @param valores
     * @return CarrinhoDeCompras
     */
    public CarrinhoDeCompras comItem(double... valores) {
        for (double valor : valores) {
            carrinho.adiciona(new Item("item", 1, valor));
        }
        return this.carrinho;
    }

    /**
     *
     * @return CarrinhoDeCompras
     */
    public CarrinhoDeCompras cria() {
        return this.carrinho;
    }
}
