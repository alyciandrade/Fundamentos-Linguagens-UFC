public class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String cliente, int numConta, double saldo, double limite) {
        super(cliente, numConta, saldo); 
        this.limite = limite;
    }

    @Override
    public double sacar(double valor) {
        if (valor > 0 && (this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + this.saldo + ", Limite disponível: R$" + this.getLimiteDisponivel());
            return valor;
        } else {
            System.out.println("Saldo + Limite insuficientes ou valor de saque inválido.");
            return 0; 
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimiteDisponivel() {
        if (this.saldo >= 0) {
            return this.limite;
        } else {
            return this.limite + this.saldo; 
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("\n--- DADOS DA CONTA ESPECIAL ---");
        System.out.println("Cliente: " + getCliente());
        System.out.println("Número da Conta: " + getNumConta());
        System.out.println("Saldo: R$" + getSaldo());
        System.out.println("Limite: R$" + getLimite());
        System.out.println("------------------------------");
    }
}
