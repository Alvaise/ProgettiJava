import java.util.Scanner;

public class Divisione_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire primo numero: ");
		int n1 = sc.nextInt();
		System.out.println("Inserire secondo numero: ");
		int n2 = sc.nextInt();
		System.out.println("Quoziente: "+ (double)n1/n2);
		System.out.println("Resto: "+ (double)n1%n2);
	}

}
