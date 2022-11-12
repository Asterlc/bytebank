package funcionario;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String tipo;
    private double bonusValor = 0.2;

    public abstract double getBonus();

    public abstract String getNome();

    public abstract void setNome(String nome);

    public abstract String getCpf();

    public abstract void setCpf(String cpf);

    public abstract double getSalario();

    public abstract void setSalario(double salario);

    public abstract double salarioComBonus();

    public abstract String getTipo();
}
