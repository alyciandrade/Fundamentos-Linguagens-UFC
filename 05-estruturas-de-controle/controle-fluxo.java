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
