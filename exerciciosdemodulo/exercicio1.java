package exerciciosdemodulo;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um número:");
		int numero = entrada.nextInt();
		if (numero >= 0 && numero <= 10 && numero % 2 == 0) {
			System.out.println("este numero está na faixa entre 0 e 10, e é par");
		} else if(numero >= 0 && numero <= 10 && numero % 2 == 1) {
			System.out.println("este numero está na faixa entre 0 e 10, porém ele é impar");
		} else 
			System.out.println("este numero não se encontra na faixa desejada");
		
			entrada.close();
	}

}
