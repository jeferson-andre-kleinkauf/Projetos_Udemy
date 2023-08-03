package classe;

import java.util.Date;

public class EqualsHashcode {

	public static void main(String[] args) {
		
		equalss u1 = new equalss();
		u1.nome = "Pedro silva";
		u1.email = "pedro.silva@ezemail.com.br";
		
		equalss u2 = new equalss();
		u2.nome = "Pedro silva";
		u2.email = "pedro.silva@ezemail.com.br";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u2.equals(new Date()));
	}
}
