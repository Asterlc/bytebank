package funcionario;

public class Diretor extends Funcionario {
    @Override
    public double getBonus(){
        return (getSalario() + getBonus())*1.05;
}
