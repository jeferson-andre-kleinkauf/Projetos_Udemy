package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String s = "texto";
		s.toUpperCase();
		
		String o = new String("texto");
		s.toUpperCase();
		
		// objetos carregam comortamentos
		// wrapers s�o a vers�o objeto dos tipos primitivos 
		
		int a = 123;
        System.out.println(a);
	}
}
