package exerciciosdemodulo;

import java.util.Scanner;

public class ValorMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int maiorvalor = 0;
		int contador = 0;
		do {
			System.out.println("\nDigite um numero:");
			int valor = entrada.nextInt();
			if(valor > maiorvalor) {
				maiorvalor = valor;
			}
			contador++; 
		} while(contador != 10);
		System.out.println("o maior valor foi: " + maiorvalor );
		entrada.close();
	}

}
