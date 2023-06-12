import java.util.Scanner;

public class PerimetroRettangolo_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire base: ");
		int b = sc.nextInt();
		System.out.println("Inserire Altezza: ");
		int a = sc.nextInt();
		double p = 2*(a+b);
		System.out.println("Il perimetro è "+ p);
	}

}
