package tipos;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean sacar(double valor) {
        Conta bancoTaxas = new Conta(0,1);
        super.transferir(0.20, bancoTaxas);
        return super.sacar(valor);
    }
}
