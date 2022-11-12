package funcionario.teste;

import funcionario.Diretor;
import funcionario.Funcionario;
import funcionario.Gerente;
import recursos.ControleBonus;

public class TesteReferencia {
    public static void main(String[] args) {
        Diretor d1 = new Diretor();
        Gerente g1 = new Gerente();
        Funcionario f1 = new Funcionario();
        ControleBonus controle = new ControleBonus();
        d1.setNome("Diretor");
        d1.setSalario(9000);
        controle.registra(d1);
        //g1.setNome("Gerente");
        //g1.setSalario(5000);
        //controle.registra(g1);
        //f1.setNome("Funcionario");
        //f1.setSalario(2000);
        //controle.registra(f1);
        System.out.println(controle.getSoma());
    }
}
