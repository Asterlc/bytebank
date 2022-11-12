package tipos.teste;

import tipos.ContaCorrente;
import tipos.ContaPoupanca;

public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(111,2345);
        ContaPoupanca contaPoupanca = new ContaPoupanca(111,2345);

        contaCorrente.depositar(1500);
        contaCorrente.transferir(500, contaPoupanca);
        System.out.println(contaPoupanca.getSaldo());
        System.out.println(contaCorrente.getSaldo());

        contaCorrente.sacar(20);
        System.out.println(contaCorrente.getSaldo());
    }
}
