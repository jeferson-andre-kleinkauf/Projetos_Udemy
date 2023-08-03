package exerciciosdemodulo;

import java.util.Scanner;

public class NumeroPrimoComSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contadordedivisores = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero");
		int numero = entrada.nextInt();
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
			contadordedivisores ++; 
		}
		}
		switch ( contadordedivisores ) {
		case 0:
			System.out.printf("numero é primo: %d ", numero );
			break;
		default:
			System.out.printf("numero não é primo %d ", numero);
		}
		entrada.close();
	}

}
