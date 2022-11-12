package funcionario;

public class Gerente extends Funcionario {
    private int senha;

    public Gerente() {
        super();
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    @Override
    public double getBonus() {
        return getSalario() * 1.15;
    }

    @Override
    public String getNome() {
        return super.nome;
    }

    @Override
    public void setNome(String nome) {
        super.nome = nome;
    }

    @Override
    public String getCpf() {
        return super.cpf;
    }

    @Override
    public void setCpf(String cpf) {
        super.cpf = cpf;
    }

    @Override
    public double getSalario() {
        return super.salario;
    }

    @Override
    public void setSalario(double salario) {
        super.salario = salario;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
