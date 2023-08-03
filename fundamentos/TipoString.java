package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("olá pessoal".charAt(0));
		System.out.println("olá pessoal".charAt(1));
		System.out.println("olá pessoal".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("final"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("dia!"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
	var nome = "Pedro";
	var sobrenome = "santos";
	var idade = 33;
	var salario = 12345.987;
	
	System.out.println("\n\nNome: " + nome + "\nSobrenome " + sobrenome + "\nIdade " + idade + "\nSalario " + salario);
	System.out.printf("\n\n O senhor %s %s tem %d anos e ganha %.2f R$", nome , sobrenome, idade, salario);		
	
	String frase = String.format("\n\n O senhor %s %s tem %d anos e ganha %.2f R$", nome , sobrenome, idade, salario);
	System.out.println(frase);
	System.out.println("frase qualquer".contains("qual"));
	System.out.println("frase qualquer".indexOf("qual"));
	System.out.println("frase qualquer".substring(6, 10));
	}

}
