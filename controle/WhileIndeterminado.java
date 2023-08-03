package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		while(!valor.equalsIgnoreCase("Sair")) {
			System.out.println("voce diz: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}

}
