package aula_exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da excpetion: ");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto não será impressio");
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção ao acessar um índice do vetor que não existe");
		}
		
		System.out.println("Esse texto será impresso após a exception");
		
	}

}
