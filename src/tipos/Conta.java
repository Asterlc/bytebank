package tipos;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero){
        this.agencia = agencia;
        this.numero=numero;
    }

    public boolean depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Valor indisponível para saque, verifique sua conta");
            return false;
        }
    }

    public void transferir(double valor, Conta remetente, Conta destinatario) {
        if (remetente.saldo >= valor) {
            remetente.saldo -= valor;
            destinatario.saldo += valor;
        } else {
            System.out.println("Valor indisponível para transferẽncia, verifique sua conta");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public boolean setAgencia(int agencia) {
        if(agencia > 0){
            this.agencia = agencia;
            return true;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean setNumero(int numero) {
        if(numero > 0){
            this.numero = numero;
            return true;
        }
        System.out.println("Número de conta não pode ser um valor negativo");
        return false;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
