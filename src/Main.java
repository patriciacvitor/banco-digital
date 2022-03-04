import banco.*;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Patrícia");

        IConta contaCorrente = new ContaCorrente(cliente1);
        contaCorrente.depositar(100);
        Conta contaPoupanca = new ContaPoupanca(cliente1);
        contaPoupanca.depositar(300);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaCorrente.transferir(50, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();


    }
}

