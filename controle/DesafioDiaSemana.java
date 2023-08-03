package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Domingo -> 1
		// segunda -> 2
		// quarta -> 4

		// criar um scanner para pegar o nome do dia e pegar o numero do dia

		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o dia da semana! ");
		String dia = entrada.next();

		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if (dia.equalsIgnoreCase("Terça")) {
			System.out.println(3);
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if (dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		} else
			System.out.println("o que voce digitou não corresponde a um dia da semana ");
		entrada.close();
	}

}
