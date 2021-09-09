import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um dia da semana: ");
		int diaSemana = scan.nextInt();
		
		switch (diaSemana){
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Terça"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("Sabado"); break;
			default: System.out.println("Valor valido");
		};

		System.out.println("Digite o valor da nota1: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite o valor da nota2: ");
		double nota2 = scan.nextDouble();
		System.out.println("Digite o valor da nota3: ");
		double nota3 = scan.nextDouble();
		System.out.println("Digite o valor da nota4: ");
		double nota4 = scan.nextDouble();
		double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
	
		System.out.println("a média é: " + mediaNotas);
		if(mediaNotas == 10){
			System.out.println("Aluno aprovado com louvores");
		} else if (mediaNotas >= 7){
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
		
		scan.close();
	};
};
