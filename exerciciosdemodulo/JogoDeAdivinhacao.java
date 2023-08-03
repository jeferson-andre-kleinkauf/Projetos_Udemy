package exerciciosdemodulo;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			Scanner entrada = new Scanner(System.in); 
			int continuar;
			int numeroSorteado;
			int tentativas;
			int numero;
			do {
				System.out.println("ordenando numero entre 0 e 100...\n");
				Random aleatorio = new Random();
				numeroSorteado = aleatorio.nextInt(101); 
				System.out.println("começou o jogo! será que me consegue vencer?");
				tentativas = 0;
				do {
					tentativas++;
					System.out.printf("Tentativas %d ", tentativas);
					numero = entrada.nextInt();
					if(numero > numeroSorteado) {
						System.out.printf("\n O numero sorteado e menor que %d\n\n", numero);
					} else if (numero < numeroSorteado) {
						System.out.printf("\n O numero sorteado e maior que %d\n\n", numero);
					} else {
						System.out.printf("\n Parabéns! voce acertou o numero em %d tentativas!\n\n", tentativas);
						break;
					}
				} while(tentativas != 10);
			
			System.out.println("Digite O para sair,ou qualquer outro numero para continuar: ");
			continuar = entrada.nextInt();
			} while(continuar != 0);
	entrada.close();
	} 

}
