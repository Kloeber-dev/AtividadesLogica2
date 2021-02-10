package aula_array;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Integer[][] a = new Integer[100][100];
		
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a.length; j++){
				a[i][j]=i-j;
				System.out.println(a[i][j]);
			}
		
		System.out.println("Elementos Multiplicados por 7: ");
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a.length; j++){
				a[i][j]=a[i][j]*7;
				System.out.println(a[i][j]);
			}
	}

}
