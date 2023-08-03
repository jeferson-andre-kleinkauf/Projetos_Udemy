package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		//altera codificaçao do teclado
		Locale.setDefault(new Locale("en", "us"));
		// TODO Auto-generated method stub
		//scanner pega do teclado
		Scanner scanner = new Scanner(System.in);
		//relace substitui um caractere por outro
		System.out.print("informe o primeiro salario");
		String valor1 = scanner.next().replace(",", ".");
		
		System.out.print("informe o segundo salario");
		String valor2 = scanner.next().replace(",", ".");
		
		System.out.print("informe o terceiro salario");
		String valor3 = scanner.next().replace(",","." );
		//converte para um numero com ponto flutuante
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A média dos salários é " + media);
	}

}
