package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		//offer e Add -> adicionam elementos na fila
		//diferença é o comportamento quando a fila está cheia
		
		fila.add("Ana"); //retorna false
		fila.offer("Bia"); //lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		//Peek e Element -> obtem o proximo elemento da fila(sem remover)
		//Diferença ocorre quando a fila está vazia
		System.out.println(fila.peek()); //retorna null se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lança uma exceção
		System.out.println(fila.element());
		
		//fila.size(); //tamanho da fila
		//fila.clear(); // limpar fila
		//fila.isEmpty(); 
		//fila.contains(...);
		
		//Poll  e Remove -> obter o proximo elemento
		// da fila e remove
		
		// diferença de comportamento 
		//ocorre quando a fila está vazia
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); //Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
	}
}
