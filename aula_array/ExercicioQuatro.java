package aula_array;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Integer[][] k = new Integer[50][100];
		for(int i = k.length-1; i >= 0; i--)
			for(int j = k.length; j>=i; j--) {
				k[i][j] = j+i;
				System.out.println(k[i][j]);
			}
	}
}
