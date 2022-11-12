package tipos.teste;

import tipos.Conta;

public class TesteSaqueNegativo {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1111, 115412);
        conta1.depositar(100);
        conta1.sacar(200);
        System.out.println(conta1.getSaldo());
        conta1.sacar(50);
        System.out.println(conta1.getSaldo());
    }
}
