package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>(); // garante ordem de inserção
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		Set<String> nums = new HashSet<>();
		nums.add("Ana");
		nums.add("Carlos");
		nums.add("Luca");
		nums.add("Pedro");

		for (String n : nums) {
			System.out.println(n);
		}
		Set <Integer> numes = new HashSet<>();
		numes.add(1);
		numes.add(2);
		numes.add(120);
		numes.add(6);
		
		// nums.get(1); não é possivel acessar pelo indice
		
		for(int n: numes) {
			System.out.println(n);
		}
	}
}
