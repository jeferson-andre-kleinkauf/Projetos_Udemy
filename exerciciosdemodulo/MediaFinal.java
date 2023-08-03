package exerciciosdemodulo;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite uma nota");
		double nota = entrada.nextDouble();
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("digite a segunda nota");
		double nota2 = entrada2.nextDouble();
		double media = (nota + nota2) / 2;
		if (media >= 7.0) {
			System.out.println("Aprovado");
		} else if (media < 7.0 && nota > 4.0) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");

		}
		entrada.close();
		entrada2.close();
	}
}
