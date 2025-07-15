# Estruturas de Controle

### Estrutura de Seleção em **Java**
**Contexto**: Programa Java que lê a idade de uma pessoa e determina se ela é menor de idade (menor que 18 anos) ou maior de idade (igual ou maior que 18 anos).

     public class exemplo01 {

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


### Estrutura de Repetição em **Java**
**Contexto**: Programa que imprime na tela todos os números pares entre 1 e 50.

     public class exemplo02 {

		public static void main(String[] args) {
			for(int i = 0; i <= 50; i+=2)
				System.out.print(i + " ");
		}
		
     }

### Controle de Fluxo em **Java**
**Contexto**: Programa que solicita ao usuário a digitação de um número inteiro. O programa deve exibir na tela a tabuada deste número.

     public class exemplo03 {

     	public static void main(String[] args) {
	     	Scanner input = new Scanner(System.in);
		
	     	System.out.print("Digite um número inteiro: ");
	     	int num = input.nextInt();
		
	     	while (num >= 0){
			
	     		for(int i = 0; i <= 10; i++)
		     	{
		     		int resposta = i * num; 
		     		System.out.println(i +" * " + num + " = " + resposta);
		     	}
		     	break;
			
		}
         
	     }

     }
