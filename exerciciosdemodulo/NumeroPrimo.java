package exerciciosdemodulo;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadordedivisores = 0; 
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero");
		int numero = entrada.nextInt();
		
		for(int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadordedivisores ++;
			}
		}
			if ( contadordedivisores == 0) {
			System.out.printf("numero � primo %d", numero);
		} else {
			System.out.printf("numero n�o � primo %d", numero);
		}
		entrada.close();
	}

}
