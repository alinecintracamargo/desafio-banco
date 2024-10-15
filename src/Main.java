public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Exemplo");

        Cliente Aline = new Cliente();
        Aline.setNome("Aline");

        Conta cc = new ContaCorrente(Aline);
        Conta cp = new ContaPoupanca(Aline);

        banco.abrirConta(cc);
        banco.abrirConta(cp);

        cc.depositar(100);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.imprimirHistorico();
        cp.imprimirHistorico();

        banco.listarContas();
    }
}
