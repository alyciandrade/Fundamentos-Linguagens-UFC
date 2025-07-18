# Programação Funcional

## Descrição

Este exemplo resolve um problema comum: calcular a média das notas acima de 7 de uma lista. Utiliza conceitos de programação funcional como:

- Recursão para somar os elementos da lista. Foi usada a função `soma_recursiva` para somar os elementos.
- Funções de alta ordem: `filter`, `map` e `reduce`. A função `filter()` filtra as notas maiores ou iguais a 7.

---

## Código em Python

    from functools import reduce

    notas = [6.5, 8.0, 9.5, 7.0, 5.5, 10.0]

    notas_boas = list(filter(lambda x: x >= 7, notas))

    def soma_recursiva(lista):
    if not lista:
        return 0
    return lista[0] + soma_recursiva(lista[1:])

    soma = soma_recursiva(notas_boas)
    media = soma / len(notas_boas) if notas_boas else 0

    print("Notas boas:", notas_boas)
    print("Média das boas notas:", media)

## Saída Esperada

    Notas boas: [8.0, 9.5, 7.0, 10.0]
    Média das boas notas: 8.625


