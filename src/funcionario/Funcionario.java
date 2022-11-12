package funcionario;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public abstract double getBonus();

    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract String getCpf();

    public abstract void setCpf(String cpf);

    public abstract double getSalario();

    public abstract void setSalario(double salario);
}
