package exerciciosdemodulo;

import java.util.Calendar;

public class AnoBissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		if (year % 4 == 0) {
			System.out.println("é um ano bissexto");
		} else {
			System.out.println("não é um ano bissexto"); 
		}
			
		
	}

}
