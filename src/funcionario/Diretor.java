package funcionario;

import informacao.Autenticavel;

public class Diretor extends Funcionario implements Autenticavel {
    private int senha;

    @Override
    public double getBonus() {
        return getSalario() * 1.05;
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
