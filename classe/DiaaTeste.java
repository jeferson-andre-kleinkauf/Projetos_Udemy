package classe;

public class DiaaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Diaa d1 = new Diaa();
		d1.imprimirDiaaFormatada();
		d1.ano = 2021;
		
		var d2 = new Diaa(31, 05, 2020);
		String diaaFormatada1 = d1.obterDiaaFormatada();
		System.out.println(diaaFormatada1);
		System.out.println(d2.obterDiaaFormatada());
		
		d1.imprimirDiaaFormatada();
		d2.imprimirDiaaFormatada();
	}

}
