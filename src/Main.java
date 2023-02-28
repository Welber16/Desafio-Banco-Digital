public class Main {
    public static void main(String[] args) {
        Cliente welber = new Cliente();
        welber.setNome("Welber");

        Conta cc = new ContaCorrente(welber);
        Conta poupanca = new ContaPoupanca(welber);


        cc.depositar(200);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
