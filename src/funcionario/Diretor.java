package funcionario;

public class Diretor extends Funcionario {
    @Override
    public double getBonus(){
        return (super.getSalario() + super.getBonus())*1.05;
    }
}
