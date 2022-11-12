package funcionario;

public class Caixa extends Funcionario{

    @Override
    public double getBonus() {
        return super.salario *0.05;
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

    @Override
    public String getTipo() {
        return null;
    }
}
