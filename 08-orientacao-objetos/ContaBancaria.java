public abstract class ContaBancaria {
    private String cliente;
    private int numConta;
    protected double saldo; 
    
    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public double sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + this.saldo);
            return valor;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            return 0; 
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + this.saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public String getCliente() {
        return cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void mostrarDados();
}
