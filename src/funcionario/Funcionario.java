package funcionario;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    protected String tipo;
    protected double bonusValor = 0.2;

    public abstract double getBonus();

    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract String getCpf();

    public abstract void setCpf(String cpf);

    public abstract double getSalario();

    public abstract void setSalario(double salario);

    public abstract String getTipo();
}
