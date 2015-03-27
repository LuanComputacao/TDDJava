package tests;

import classes.CarrinhoDeCompras;
import classes.Item;
import classes.MaiorPreco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by luan on 20/03/15.
 */
public class MaiorPrecoTest {


    private CarrinhoDeCompras carrinho;

    @Before
    public void inicializa() {
        this.carrinho = new CarrinhoDeCompras();
    }


    @Test
    public void deveRetornarZeroSeCarrinhoVazio() {
        assertEquals(0.0, carrinho.maiorValor(), 0.0001);
    }

    @Test
    public void deveRetornarValorDoItemSeCarrinhoComUmElemento() {
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));

        assertEquals(900.0, carrinho.maiorValor(), 0.0001);
    }

    @Test
    public void deveRetornarMaiorValorSeCarrinhoContemVariosElementos() {
        carrinho.adiciona(new Item("Geladeira", 1, 900.0));
        carrinho.adiciona(new Item("Fogão", 1, 1500));
        carrinho.adiciona(new Item("Maquina de Lavar", 1, 750));

        assertEquals(900.0, carrinho.maiorValor(), 0.0001);
    }
}
