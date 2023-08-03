package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		//offer e Add -> adicionam elementos na fila
		//diferen�a � o comportamento quando a fila est� cheia
		
		fila.add("Ana"); //retorna false
		fila.offer("Bia"); //lan�a uma exce��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		
		//Peek e Element -> obtem o proximo elemento da fila(sem remover)
		//Diferen�a ocorre quando a fila est� vazia
		System.out.println(fila.peek()); //retorna null se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); //lan�a uma exce��o
		System.out.println(fila.element());
		
		//fila.size(); //tamanho da fila
		//fila.clear(); // limpar fila
		//fila.isEmpty(); 
		//fila.contains(...);
		
		//Poll  e Remove -> obter o proximo elemento
		// da fila e remove
		
		// diferen�a de comportamento 
		//ocorre quando a fila est� vazia
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); //Lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
	}
}
