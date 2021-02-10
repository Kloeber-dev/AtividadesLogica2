package aula_array;

public class ExercicioUm {

	public static void main(String[] args) {
		Integer[] k = new Integer[9];
		for (int i = 0; i<k.length; i++) {
			k[i] = i;
			System.out.println(k[i]);
		}
		
		for (int i = 0; i<k.length; i++) {
			k[i] = k[i] * 3;
			System.out.println(k[i]);
		}
	}

}
