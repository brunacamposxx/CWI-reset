import java.util.Scanner;

public class AlunoResetLeituraTeclado {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		String nomeProprio = scan.nextLine();
		System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + nomeProprio);

		scan.close();
	}	
};

// Exercício:
// Vamos refazer o exercício da aula 3 usando a classe Scanner:
// Crie um arquivo chamado AlunoResetLeituraTeclado.java
// Implemente um programa que solicite para o usuário digitar o próprio nome. Ao final imprima na tela o texto “Sou aluno do Level 1 do CWI Reset! Me chamo {SEU NOME}”
// Compile e execute o programa manualmente ou utilize a IDE para facilitar