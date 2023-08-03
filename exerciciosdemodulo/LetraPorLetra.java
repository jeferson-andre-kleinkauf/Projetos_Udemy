package exerciciosdemodulo;

import java.util.Scanner;

public class LetraPorLetra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite uma palavra");
		String palavra = entrada.nextLine();
		
		char letras[] = palavra.toCharArray();
		for(int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		entrada.close();
	}

}
