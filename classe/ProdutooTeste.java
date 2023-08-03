package classe;

public class ProdutooTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produtoo p1 = new Produtoo("Notebook", 4356.89);
		
		var p2 = new Produtoo();
		p2.nome = "caneta preta";
		p2.preco = 12.56;
		Produtoo.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$ %.2f.", mediaCarrinho);
	}
	

}
