# Estruturas de Controle

### Estrutura de Seleção em Java
**Contexto**: Programa Java que lê a idade de uma pessoa e determina se ela é menor de idade (menor que 18 anos) ou maior de idade (igual ou maior que 18 anos). 

     public class q2 {

	      public static void main(String[] args) {
	      	      Scanner resposta = new Scanner (System.in);
		
        		    int idade;
        		
        		    System.out.print("Digite sua idade: ");
        		    idade = resposta.nextInt();
        		
        		    if(idade < 18) {
			                  System.out.println("O usuário é MENOR DE IDADE! ");
		            }
		            else 
			                  System.out.println("O usuário é MAIOR DE IDADE! ");

	      }

     }
