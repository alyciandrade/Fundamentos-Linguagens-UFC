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
