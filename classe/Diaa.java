package classe;

public class Diaa {

	int dia;
	int mes;
	int ano;

	Diaa(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
		//byte, short, int, long -> 0
		//float, double -> 0.0
		// boolean -> false
		// char ->'\n0000'
		// Objetos -> null
	}

	Diaa(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	String obterDiaaFormatada() {
		String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}
	void imprimirDiaaFormatada() {
		System.out.println(this.obterDiaaFormatada());
	}
}
