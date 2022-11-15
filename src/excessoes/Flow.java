package excessoes;

import tipos.Conta;

import java.util.logging.*;

public class Flow {
    private static final Logger LOGGER = Logger.getLogger( Flow.class.getName() );
    public static void main(String[] args) throws ContaExcessao {
        System.out.println("main entra na pilha");
        metodo1();
        System.out.println("main sai da pilha");
    }

    private static void metodo1() throws ContaExcessao {
        System.out.println("metodo1 entra na pilha");
        try {
            metodo2();
        }catch (Exception ex){
            LOGGER.log(Level.INFO, ex.getMessage(), ex);
            throw new ContaExcessao("Deu errado");
        }
        System.out.println("metodo1 sai da pilha");
    }

    private static void metodo2() throws ContaExcessao{
        System.out.println("metodo2 entra na pilha");
        Conta conta = new Conta(35, 12);

        for (int i = 0; i < 5; i++) {
            System.out.println("Executa método2:>>" + i);
        }

        System.out.println("Total " + Conta.getTotalContas());
        System.out.println("metodo2 sai da pilha");
    }

}
