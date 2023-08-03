package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// if(...) senten�a; ou {}
		// while (...) senten�a; ou {}
		// for (...; ...; ...) senten�a; ou {}
		// do {} while(...);
		
		//SuSu 4 de mai. de 2023
		Scanner entrada = new Scanner(System.in);

		String texto = "por favor";
		do {
			System.out.println("Voce precisa falar as palavras m�gicas...");
			System.out.println("quer sair?");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("obrigado!");
		entrada.close();
	}
}
