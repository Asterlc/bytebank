package tipos;

import excessoes.ContaExcessao;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero) throws ContaExcessao{
        super(agencia, numero);
    }

    @Override
    public boolean sacar(double valor) throws ContaExcessao {
        Conta bancoTaxas = new Conta(0,1);
        super.transferir(0.20, bancoTaxas);
        return super.sacar(valor);
    }
}
