# Implementação de Pilha de Chamadas

## Objetivo
Demonstrar e explicar o funcionamento da pilha de chamadas em um exemplo de função recursiva e ilustrar como os valores são empilhados e retornados. A função escolhida foi o cálculo fatorial em python.

---

### Fatorial.py

     def fatorial(n):
       print(f"Chamada de fatorial({n})")

    if n == 0:
        print(f"Base case: fatorial(0) retorna 1")
        return 1
    else:
        resultado = n * fatorial(n - 1)
        print(f"Retornando de fatorial({n}): {n} * {resultado / n} = {resultado}")
        return resultado

     numero = 4
     print(f"\nCalculando o fatorial de {numero}:\n")
     fatorial(numero)

