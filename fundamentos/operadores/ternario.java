package fundamentos.operadores;

public class ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double media = 8.6;
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial ;
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim":"não";
		System.out.println("Tem desconto ?" + resultado );
		
	}

}
