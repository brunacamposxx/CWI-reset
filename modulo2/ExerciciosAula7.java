import java.util.Scanner;
import java.util.Locale;

public class ExerciciosAula7 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);
		
		System.out.println("Digite um número: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite outro número: ");
		int valor2 = scan.nextInt();
		int resultado = valor1 + valor2;
		System.out.println("valor1 + valor2 é: " + resultado);


		System.out.println("Digite a nota1: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a nota2: ");
		double nota2 = scan.nextDouble();
		System.out.println("Digite a nota3: ");
		double nota3 = scan.nextDouble();
		System.out.println("Digite a nota4: ");
		double nota4 = scan.nextDouble();
		double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média das notas é: " + mediaNotas);


		System.out.println("Quanto você ganha por hora? ");
		double valorPorHora = scan.nextDouble();
		System.out.println("Quantas horas você trabalha por mês? ");
		double horasTrabalhadasPorMes = scan.nextDouble();
		double salarioMensal = valorPorHora * horasTrabalhadasPorMes;
		System.out.println("O seu salário mensal é de " + salarioMensal);

		scan.close();
	};
};


// Exercícios:
// Faça um programa que tenha como entradas dois números e imprima a soma de ambos. Utilize a classe Scanner para obter as entradas.
// Faça um programa que tenha como entradas 4 notas e imprima a média. Utilize a classe Scanner para obter as entradas.
// Faça um programa que solicite quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.