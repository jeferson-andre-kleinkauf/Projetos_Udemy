package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		double a = 2.3;
		String s = "Bom dia x";
		s = s.replace("x", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		String c = "jefy".toUpperCase();
		System.out.println(c);
		
		String y = "Bom dia c".replace("c", "jeferson");
		System.out.println(y);
	}

}
