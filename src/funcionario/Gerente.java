package funcionario;

public class Gerente extends Funcionario {
    private int senha;

    public Gerente() {
        super();
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    @Override
    public double getBonus() {
        return (getSalario() + getBonus());
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
