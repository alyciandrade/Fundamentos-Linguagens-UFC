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
