package fundamentos.operadores;

public class DesafiosLogicos {

	public static void main(String[] args) {
		// trabalho na terça (V ou F)
		// trabalho na quinta (V ou F)
		// se os dois trabalhos derem certo compra televisão de 50 polegadas
		// se somente um dos dois trabalhos derem certo compra uma televisão de 32 polegadas
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		//operador Binário
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//operador unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("comprou TV 50\"? " + comprouTv50);
		System.out.println("comprou TV 32\"? " + comprouTv32);
		System.out.println("comprou Sorvete\" ? " + comprouSorvete);
		
		
		System.out.println("Mais saudável? " + maisSaudavel);
	}
}
