package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa = "lilad";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("sei o Bassai-Dai...");
		case "marrom":
			System.out.println("sei o Tekki Shodan...");
		case "roxa":
			System.out.println("sei o Heian Godan...");
		case "verde":
			System.out.println("sei o Heian yodan...");
		case "laranja":
			System.out.println("sei o Heian Sandan");
		case "vermelha":
			System.out.println("sei o Heian Nidan");
		case "amarela":
			System.out.println("sei o Heiann shodan");
		break;	
		default:
			 System.out.println("não sei nada");
		}
		System.out.println("FIM!");
	}
}
