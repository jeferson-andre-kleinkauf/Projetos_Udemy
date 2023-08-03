package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// if(...) sentença; ou {}
		// while (...) sentença; ou {}
		// for (...; ...; ...) sentença; ou {}
		// do {} while(...);
		
		//SuSu 4 de mai. de 2023
		Scanner entrada = new Scanner(System.in);

		String texto = "por favor";
		do {
			System.out.println("Voce precisa falar as palavras mágicas...");
			System.out.println("quer sair?");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("obrigado!");
		entrada.close();
	}
}
