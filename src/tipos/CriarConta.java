package tipos;

public class CriarConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(1111,112022);
        primeiraConta.depositar(200);
        //primeiraConta.agencia= 1111;
        //primeiraConta.numero = 11202;
        //primeiraConta.titular = "Lucas Sousa";
        //System.out.println(primeiraConta.titular);
        Conta segundaConta = new Conta(1111, 112094);
        //System.out.println(segundaConta.getTitular());
        System.out.println(segundaConta.getSaldo());

    }
}
