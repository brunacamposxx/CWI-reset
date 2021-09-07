class Argumentos {
	public static void main(String[] args) {
		System.out.println("Você digitou " + args[0] );
	}
}

// para compilar: javac Argumentos.java
// para adicionar argumentos em java: java NomeDoArquivo Argumento;
// ou seja, nesse caso: java Argumentos Bruna;
// para digitar mais de uma palavra basta escrever entre aspas, como strings;
// exemplo: java Argumentos "Scott Summers";
// saida: Você digitou Scott Summers
