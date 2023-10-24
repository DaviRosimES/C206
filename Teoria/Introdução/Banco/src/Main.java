package src;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();  // Criando uma instância de Conta
        Conta conta2 = new Conta();

        conta1.nomeDoDono = "Joãozinho";
        conta1.limite = 100;
        conta1.numero = 1234;
        conta1.saldo = 10;

        conta2.nomeDoDono = "Pedrinho";
        conta2.limite = 200;
        conta2.numero = 11223344;
        conta2.saldo = 1000000000;
    }
}
