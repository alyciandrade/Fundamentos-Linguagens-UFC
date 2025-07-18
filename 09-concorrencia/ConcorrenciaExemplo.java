public class ConcorrenciaExemplo {

    public static void main(String[] args) {
        // Thread que imprime números pares
        Thread pares = new Thread(() -> {
            for (int i = 0; i <= 15; i += 2) {
                System.out.println("Pares: " + i);
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

       // Thread que imprime números ímpares
        Thread impares = new Thread(() -> {
            for (int i = 1; i <= 15; i += 2) {
                System.out.println("Ímpares: " + i);
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        pares.start();
        impares.start();
    }
}
