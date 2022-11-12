package tipos.teste;

import tipos.Conta;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1111, 114587);
        conta1.depositar(5700);
        conta1.depositar(50);
        System.out.println(conta1.getSaldo());

        Conta conta2 = new Conta(1111,113396);
        conta2.depositar(1000);

        conta1.transferir(500, conta1, conta2);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        conta2.sacar(1100);
        System.out.println(conta2.getSaldo());
    }
}
