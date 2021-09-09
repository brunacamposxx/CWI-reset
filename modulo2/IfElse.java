import java.util.Scanner;


public class IfElse {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		
		// System.out.println("Digite sua idade");
		// int idade = scan.nextInt();

		// if ( idade >= 18 ) {
		// 	System.out.println("É maior de idade");
		// } else {
		// 	System.out.println("Não é maior de idade");
		// };

		System.out.println("Entre com o valor do item");
		double item = scan.nextDouble();

		if(item <= 10){
			System.out.println("Barato");
		} else if (item <= 15){
			System.out.println("Da pra pedir um desconto");
		} else if (item <= 17) {
			System.out.println("Está caro... melhor pesquisar mais");
		} else{
			System.out.println("Nao compre! Muito caro!");
		}	

		
		scan.close();
	};
};
