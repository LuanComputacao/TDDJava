package tests;

import classes.ConversorDeNumeroRomano;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by luan on 15/03/15.
 */
public class ConversorDeNumerosRomanosTest {
    @Test
    public void deveEntenderOSimboloI() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("I");
        assertEquals(1, numero);
    }

    @Test
    public void deveEntenderOSimboloV() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("V");
        assertEquals(5, numero);
    }

    @Test
    public void deveEntenderOSimboloII() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("II");
        assertEquals(2, numero);
    }

    @Test
    public void deveEntenderQuatroSimbolosDoisADoisComoXXII() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("XXII");
        assertEquals(22 , numero);
    }

    @Test
    public void deveEntenderSimbolosComoIX() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("IX");
        assertEquals(9 , numero);
    }

    @Test
    public void deveEntenderSimbolosComoXXIV() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("XXIV");
        assertEquals(24 , numero);
    }
}
