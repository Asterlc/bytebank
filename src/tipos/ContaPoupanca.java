package tipos;

import excessoes.ContaExcessao;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(int agencia, int numero) throws ContaExcessao {
        super(agencia, numero);
    }
}
