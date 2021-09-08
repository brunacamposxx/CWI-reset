public class Operadores {
	public static void main(String[] args){

		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);
	
		resultado = resultado + 8;
		System.out.println(resultado);

		resultado = resultado % 7;
		System.out.println(resultado);

		String primeiroNome = "Esta é";
		String segundoNome = "uma String concatenada.";
		String terceiroNome = primeiroNome + " " + segundoNome;
		System.out.println(terceiroNome);

		resultado = resultado + 1;
		System.out.println(resultado);
		
		// ou

		resultado++;
		System.out.println(resultado);

		// ou

		System.out.println(resultado++); // valor + 1;
		// resultado += 1;
		// resultado = resultado + 1;
		System.out.println(++resultado); // 1 + valor;
	
		resultado --;
		System.out.println(resultado);

		System.out.println(resultado--);
		System.out.println(--resultado);

	};
};
