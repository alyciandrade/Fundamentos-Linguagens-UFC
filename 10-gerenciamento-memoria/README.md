# Gerencimento de Memória
Neste desafio, foi feito um comparativo entre duas linguagens com abordagens bem diferentes quanto ao gerenciamento de memória: **C** e **Java**.

## Quadro Comparativo: Gerenciamento de Memória em C vs Java

| Característica                    | C                                      | Java                                      |
|----------------------------------|----------------------------------------|-------------------------------------------|
| **Gerenciamento**                | Manual                                 | Automático (Garbage Collector)            |
| **Alocação de Memória**          | `malloc()`, `calloc()`, `realloc()`    | `new`                                     |
| **Liberação de Memória**         | `free()`                               | Automática pelo GC                        |
| **Responsabilidade**             | Do programador                         | Do sistema (JVM)                          |
| **Risco de Vazamento de Memória**| Alto                                   | Baixo                                     |
| **Risco de Acesso Inválido**     | Acesso a ponteiros inválidos é comum   | JVM detecta e evita acessos indevidos     |
| **Previsibilidade**              | Alta (controle total pelo programador) | Menor (depende do GC e seu tempo de execução) |
| **Desempenho**                   | Pode ser mais rápido e eficiente       | Pode sofrer pausas por causa do GC        |
| **Facilidade de uso**            | Mais difícil, exige atenção do dev     | Mais fácil, abstrai detalhes de memória   |

---

## Conclusão:
- **C** oferece maior controle, mas também maior risco de bugs relacionados à memória.
- **Java** simplifica o desenvolvimento ao abstrair o gerenciamento, mas com menor previsibilidade.
- A escolha entre as duas depende do contexto: sistemas embarcados e de tempo real geralmente preferem C; aplicações empresariais e web frequentemente usam Java.
