package classes;

import tests.CalculadoraDeSalarioTest;

/**
 * Created by luan on 19/03/15.
 */
public class CalculadoraDeSalario extends CalculadoraDeSalarioTest {

    public double calculaSalario(Funcionario funcionario) {
        if (funcionario.getSalario() > 3000.0) {
            return funcionario.getSalario() * 0.8;
        }
        return funcionario.getSalario() * 0.9;
    }
}
