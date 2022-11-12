package funcionario.teste;

import funcionario.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Nicolas");
        funcionario1.setCpf("39743158799");
        funcionario1.setSalario(3200);

        System.out.println(funcionario1.getBonus());
        System.out.println(funcionario1.getSalario());
        System.out.println(funcionario1.salarioComBonus());
        System.out.printf(funcionario1.getTipo());
    }
}
