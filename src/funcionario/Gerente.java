package funcionario;

import informacao.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    public Gerente() {
        super();
    }

    @Override
    public double getBonus() {
        return getSalario() * 1.2;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
