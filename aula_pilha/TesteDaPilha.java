package aula_pilha;

import java.util.Stack;

public class TesteDaPilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.push("Mauricio");
		
		System.out.println(pilha);
		
		pilha.push("Guilherme");
		
		System.out.println(pilha);
		
		String r1 = pilha.pop();
		System.out.println(r1);
		
		String r2 = pilha.pop();
		System.out.println(r2);
		
		System.out.println(pilha.vazio());
		pilha.push("Marcelo");
		System.out.println(pilha.vazio());
		
		System.out.println(pilha);
		
		Stack <String> stack = new Stack<String>();
		stack.push("Maur�cio");
		stack.push("Marcelo");
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		System.out.println(stack);

		String nome = stack.peek();
		System.out.println(nome);
	}

}
