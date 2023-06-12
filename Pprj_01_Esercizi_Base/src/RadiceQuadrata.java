import java.util.Scanner;

public class RadiceQuadrata {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire un numero intero: ");
		int n = sc.nextInt();
		System.out.println("La radice quadrata di "+n+" è "+ Math.sqrt(n));
	}

}
