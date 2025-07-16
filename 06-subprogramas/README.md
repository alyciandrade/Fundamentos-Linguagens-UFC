# Subprogramas
Este desafio tem como objetivo implementar funções que demonstrem passagem de parâmetros por valor e por referência na **linguagem C** e em **JavaScript**.

### Conceito:
- Passagem de parâmetros por **valor**: Na passagem por valor, o que é enviado para a função é uma cópia do valor da variável original. Quaisquer modificações feitas na cópida dentro da função não afetam a variável original fora da função.
- Passagem de parâmetros por **referência**: Na passagem por referência, em vez de uma cópia do valor, o que é enviado para a função é a localização de memória (o "endereço") da variável original. Quaisquer modificações feitas dentro da função afetam diretamente a variável original fora da função.

---

## Função em C 
- A função recebe um número inteiro (N) e retorne a soma dos números naturais e inteiros de 1 à N:

  #### Parâmetros por Valor:

       #include <stdio.h>

         int soma(int n){
 
         int i, soma = 0;
 
           for(i = 1; i <= n; i++){
              soma += i;
           }
           return soma;
        }
 
          int main()
       {
         int numero;
 
         printf("Digite um numero:\n");
         scanf("%i", &numero);
 
         printf("Soma e %i \n", soma(numero));
 
         return 0;
          }
