package classe;

public class DataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data dia1 = new Data(); 
		dia1.ano =  2021;
		//System.out.printf("%d/%d/%d\n", dia1.dia, dia1.mes, dia1.ano);
		
		var dia2 = new Data(31,12,2020);
		
		System.out.printf("%d/%d/%d\n", dia2.dia, dia2.mes, dia2.ano);
		dia1.imprimirDataFormatada() ;  
		dia2.imprimirDataFormatada();
	}

}
