package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SuSu 4 de mai. de 2023
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.print("Informe a nota(ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else if (nota != -1) {
				System.out.println("nota invalida");
			}
		}

		// calcular a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média =" + media);
		entrada.close();
	}

}
