package classe;

public class equalss {

	String nome;
	String email;
	
	@Override
	public boolean equals(Object objeto) {
		if (objeto instanceof equalss) {
		
		equalss outro =(equalss) objeto;
		boolean nomeIgual = outro.nome.equals(this.nome);
		boolean emailIgual = outro.email.equals(this.email)  ;
		return nomeIgual && emailIgual; 
		} else {
			return false;
		}
	 
	}
}
