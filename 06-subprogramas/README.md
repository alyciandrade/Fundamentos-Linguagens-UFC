# Subprogramas
Este desafio tem como objetivo implementar funções que demonstrem passagem de parâmetros por valor e por referência na **linguagem C** e em **JavaScript**.

### Conceito:
- Passagem de parâmetros por **valor**: Na passagem por valor, o que é enviado para a função é uma cópia do valor da variável original. Quaisquer modificações feitas na cópida dentro da função não afetam a variável original fora da função.
- Passagem de parâmetros por **referência**: Na passagem por referência, em vez de uma cópia do valor, o que é enviado para a função é a localização de memória (o "endereço") da variável original. Quaisquer modificações feitas dentro da função afetam diretamente a variável original fora da função.

---

## Função em C 

#### Parâmetros por Valor
- A função recebe um número inteiro (N) e retorne a soma dos números naturais e inteiros de 1 à N:

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

#### Parâmetros por Referência
- A função abaixo recebe um número e dobra o valor, modificando a variável original:

      #include <stdio.h>

          void dobrarValor(int *valorPtr) {
          *valorPtr = *valorPtr * 2;
          printf("Dentro da funcao 'dobrarValor': O valor agora é %d\n", *valorPtr);
          }

          int main() {
          int meuNumero; 

          printf("Digite um numero inteiro: "); 
          scanf("%d", &meuNumero); 
          printf("Antes de chamar a funcao: meuNumero = %d\n", meuNumero);

          dobrarValor(&meuNumero); 

          printf("Depois de chamar a funcao: meuNumero = %d\n", meuNumero);

          return 0;
          }

  ---
## Função em JavaScript
  
#### Parâmetros por Valor
  - O código abaixo demonstra que, ao passar um número para uma função, apenas uma cópia do valor é utilizada. Assim, mesmo que a função dobre esse valor internamente, a variável original permanece inalterada:

         function alterarNumero(num) {
           num = num * 2; 
         console.log("Dentro da função 'alterarNumero':", num);
         }

         let meuNumero = 10;
         console.log("Antes de chamar a função 'alterarNumero':", meuNumero);

         alterarNumero(meuNumero);

         console.log("Depois de chamar a função 'alterarNumero':", meuNumero);

#### Parâmetros por Referência
- Neste exemplo, 'adicionarItem' recebe a referência para o array 'minhaLista'. Alterações dentro da função afetam o array original:

       function adicionarItem(lista) {
         lista.push("Uva"); 
       console.log("Dentro da função 'adicionarItem':", lista); 
       }

       let minhaLista = ["Maçã", "Banana"];
       console.log("Antes de chamar a função 'adicionarItem':", minhaLista); 

       adicionarItem(minhaLista); 

       console.log("Depois de chamar a função 'adicionarItem':", minhaLista); 
