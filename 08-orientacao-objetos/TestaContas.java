public class TestaContas { 
    public static void main(String[] args) {
       
        ContaPoupanca cliente01 = new ContaPoupanca("Alycia Alves Andrade", 40028922, 1000.0, 30);
        ContaEspecial cliente02 = new ContaEspecial("Kali Uchis", 17052000, 1500.0, 2000.0);

        System.out.println("--- Testando Contas ---");

        
        cliente01.mostrarDados();
        cliente02.mostrarDados();

       
        System.out.println("\n--- Operações com Conta Poupança ---");
        cliente01.depositar(200);
        cliente01.sacar(300);
        cliente01.calcularNovoSaldo(0.005); 
        cliente01.mostrarDados();

        System.out.println("\n--- Operações com Conta Especial ---");
        cliente02.depositar(500);
        cliente02.sacar(3000); 
        cliente02.mostrarDados();

        System.out.println("\n--- Demonstração de Polimorfismo ---");
        ContaBancaria[] contas = new ContaBancaria[2];
        contas[0] = cliente01;
        contas[1] = cliente02;

        for (ContaBancaria conta : contas) {
            conta.mostrarDados(); 
        }
    }
}
