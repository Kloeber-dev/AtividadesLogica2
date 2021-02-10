package aula_array;

public class ExercicioDois {

	public static void main(String[] args) {
		Integer[] a = new Integer[10];
		System.out.println("Ordem Inversa: ");
		for (int i = a.length-1; i >= 0; i--) {
			a[i] = i;
			System.out.println(a[i]);
		}
		System.out.println("Ordem Crescente: ");
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
