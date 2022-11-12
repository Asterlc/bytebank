package funcionario.teste;

import funcionario.Gerente;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setSenha(123456);
        g1.setNome("Lucas Sousa");
        g1.setSalario(5600);
        System.out.println(g1.getNome());
        System.out.println(g1.autentica(123456));
        System.out.println(g1.getBonus());
    }
}
