package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("BOM");
		System.out.print("dia!\n");
		
		System.out.println("BOM");
		System.out.println("dia!");
		System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("\n\n salario: %.1f", 1234.5678);
		System.out.printf("Nome:%s%n", "joão");
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("digite a sua idade:");
		int idade = entrada.nextInt();
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		entrada.close();
	}

}
