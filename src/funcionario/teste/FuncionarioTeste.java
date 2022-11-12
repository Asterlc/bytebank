package funcionario.teste;

import funcionario.Caixa;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Caixa funcionario1 = new Caixa();

        funcionario1.setNome("Nicolas");
        funcionario1.setCpf("39743158799");
        funcionario1.setSalario(3200);

        System.out.println(funcionario1.getBonus());
        System.out.println(funcionario1.getSalario());
    }
}
