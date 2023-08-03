package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		// e
		System.out.println(condicao1 && condicao2);
		// ou
		System.out.println(condicao1 || condicao2);
		// ou exclusivo
		System.out.println(condicao1 ^ condicao2);
		// negação
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		// dupla negação
		System.out.println(!!condicao1);
		
		System.out.println("\ntabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\ntabela verdade ou (OR)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\ntabela verdade ou (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\ntabela verdade negada (NOT)");
		System.out.println(!true);
		System.out.println(!false);
	}

}
