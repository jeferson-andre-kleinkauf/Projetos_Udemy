package exerciciosdemodulo;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um n�mero:");
		int numero = entrada.nextInt();
		if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
			System.out.println("este numero est� na faixa entre 0 e 10, e � par");
		} else if(numero >= 0 && numero <= 10 && numero % 2 == 1) {
			System.out.println("este numero est� na faixa entre 0 e 10, por�m ele � impar");
		} else 
			System.out.println("este numero n�o se encontra na faixa desejada");
		
			entrada.close();
	}

}
