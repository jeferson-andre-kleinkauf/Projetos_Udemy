package fundamentos;

public class Temperatura {
public static void main(String[] args) {
	final double AJUSTE = 32;
	final double fator = 5.0/9.0;
	double f = 86;
	
	
	double celsius =(f - AJUSTE) * fator; 
	System.out.println(celsius);
	
}
}
