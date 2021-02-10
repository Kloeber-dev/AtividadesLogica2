package lista_encadeada;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exercicio4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> listinha = new LinkedList<Integer>();
		
		for (int i = 0; i < 20; i++) {
			listinha.add(i);
		}	
		Integer maior = -2;
		for (int i = 0; i<listinha.size(); i++)
			if(maior < listinha.get(i))
				maior = listinha.get(i);

		
		System.out.println("O maior nodo é: " + maior);
	}
}