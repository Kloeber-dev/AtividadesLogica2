package lista_encadeada;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exercicio3 {

	public static void main(String[] args) {
		
		LinkedList<Integer> listinha = new LinkedList<Integer>();
		
		for (int i = 0; i < 20; i++) {
			listinha.add(i);
		}

		Integer soma = new Integer(0);		
		for (int i = 0; i<listinha.size(); i++)
			soma = soma + listinha.get(i);
		System.out.println(soma);
		System.out.println(listinha.size());
	}

}
