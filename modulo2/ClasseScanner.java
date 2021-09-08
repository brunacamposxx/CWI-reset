import java.util.Scanner;
// import java.util.Locale; // import para IDE aceitar ponto para separar parte fracionária


public class ClasseScanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// scan.useLocale(Locale.ENGLISH); // import para IDE aceitar ponto para separar parte fracionária;
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome1 = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome1);

		System.out.println("Digite a sua idade: ");
		// int idade1 = scan.nextInt();
		// System.out.println("Sua idade é " + idade1);

		System.out.println("Digite a sua altura");
		double altura1 = scan.nextDouble();
		System.out.println("A sua altura é: " + altura1);

		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, e se tem bichinhos de estimação");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		byte	qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean temPet = scan.nextBoolean();

		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Sua altura é: " + altura);
		System.out.println("Tem pet?: " + temPet);

		scan.close(); // fechar scan para nao apresentar erro;
	}
};
