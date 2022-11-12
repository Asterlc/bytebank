package funcionario;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String tipo;
    private double bonusValor = 0.2;

    public Funcionario() {

    }

    public double getBonus() {
        return (this.salario * 0.1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double salarioComBonus() {
        if (this.salario > 0) {
            return this.salario += getBonus();
        }
        return this.salario;
    }

    public String getTipo(){
        return this.tipo;
    }
}
