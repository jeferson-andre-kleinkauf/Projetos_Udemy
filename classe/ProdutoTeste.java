package classe;

//import java.util.Scanner;

//import controle.Break;

public class ProdutoTeste {

	public static void main(String[] args) {
		// Break;
		// Scanner entrada = new Scanner(System.in);
		Produto p1 = new Produto("Notebook", 4356.89, 0.25);
		

		var p2 = new Produto();
		p2.nome = "caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) /2; 
		
		System.out.printf("M�dia do carrinho = R$%.2f", mediaCarrinho);
	}
}
