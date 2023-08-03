package exerciciosdemodulo;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int somadordenumeros = 0;
		int numero = 0;
		while (numero >= 0) {
			System.out.println("digite um numero inteiro (ou negativo para sair):");
			numero = entrada.nextInt();
			if(numero >= 0) {
				somadordenumeros += numero;
				System.out.printf("\nSoma até o momento: %d\n ", somadordenumeros);
			}
		}
		entrada.close();
	}

}
