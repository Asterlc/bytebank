package tipos.teste;

import tipos.Cliente;
import tipos.Conta;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Conta cliente1Conta = new Conta(1111,111456);
        Conta cliente2Conta = new Conta(1111,111568);

        cliente1Conta.setTitular(cliente1);
        cliente1Conta.getTitular().setNome("Lucas Sousa");
        cliente1Conta.getTitular().setDocument("39714375888");
        cliente1Conta.getTitular().setProfissao("Programador");
        cliente1Conta.setNumero(112022);
        cliente1Conta.depositar(3800);

        System.out.println(cliente1Conta.getSaldo());
        System.out.println(cliente1Conta.getTitular().getNome());
        System.out.println(cliente1Conta.getTotalContas());
    }
}
