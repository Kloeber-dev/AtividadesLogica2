package aula_exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da excpetion: ");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto n�o ser� impressio");
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao acessar um �ndice do vetor que n�o existe");
		}
		
		System.out.println("Esse texto ser� impresso ap�s a exception");
		
	}

}
