package recursos;


import funcionario.Funcionario;
import funcionario.Gerente;

public class ControleBonus {
    // Classe atrelada a testeReferencias para aula de polimorfismo
    private double soma;

    public void registra(Funcionario funcionario){
        this.soma = this.soma + funcionario.getBonus();
    }
    public double getSoma() {
        return soma;
    }
}
