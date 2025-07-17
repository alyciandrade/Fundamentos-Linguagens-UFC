public class ContaPoupanca extends ContaBancaria { 
    private int diaDeRendimento; 

    public ContaPoupanca(String cliente, int numConta, double saldo, int diaDeRendimento) {
        super(cliente, numConta, saldo); 
        this.diaDeRendimento = diaDeRendimento;
    }

    public double calcularNovoSaldo(double taxaDeRendimento) {
        this.saldo += this.saldo * taxaDeRendimento;
        return this.saldo;
    }

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    @Override
    public void mostrarDados() {
        System.out.println("\n--- DADOS DA CONTA POUPANÇA ---");
        System.out.println("Cliente: " + getCliente());
        System.out.println("Número da Conta: " + getNumConta());
        System.out.println("Saldo: R$" + getSaldo());
        System.out.println("Dia de Rendimento: " + getDiaDeRendimento());
        System.out.println("------------------------------");
    }
}
