# Concorrência

## Diferença entre Threads e Processos

### Processos:
É um programa em execução, com sua própria memória e recursos isolados. Cada processo é independente e não compartilha dados diretamente com outros.

- É a unidade básica de execução em um sistema operacional.
- Cada processo tem seu próprio espaço de memória, arquivos abertos, variáveis e recursos.
- Isolado dos demais: um processo não acessa diretamente os dados de outro.
- Criar um processo é mais pesado (custa mais tempo e memória).
- Se um processo falha, não afeta diretamente os outros.

**Exemplo:** Abrir dois navegadores diferentes (Chrome e Firefox). Cada um é um processo separado.

---

### Threads:
É uma parte de um processo que executa tarefas. Compartilha a memória e os recursos do processo com outras threads do mesmo processo. É usada para fazer várias tarefas ao mesmo tempo dentro de um mesmo programa.

- É uma subdivisão de um processo.
- Threads compartilham o mesmo espaço de memória do processo principal.
- Comunicação entre threads é mais rápida e direta, pois compartilham dados.
- Criar uma thread é mais leve e rápido que criar um processo.
- Se uma thread falha, pode afetar o processo inteiro.

**Exemplo:** Várias abas dentro do mesmo navegador (como várias abas do Chrome) podem ser threads dentro do mesmo processo.

---

### Implementação:
No código abaixo, é criado duas threads, uma imprime números pares e a outra, ímpares. Ambas são executadas concorrentemente, ou seja, ao mesmo tempo. A execução pode intercalar a saída no console de forma diferente a cada vez, por causa da concorrência.

```java
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
```
