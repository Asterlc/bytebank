package tipos.teste;

import tipos.Conta;

import java.sql.SQLOutput;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(1111,117489);
        primeiraConta.depositar(200);

        Conta segundaConta = primeiraConta;
        System.out.println(segundaConta.getSaldo());
        segundaConta.depositar(100);
        System.out.println(primeiraConta.getSaldo());
        //Altera o a referencia original, ambos apontam para mesmo endereço.
    }
}
