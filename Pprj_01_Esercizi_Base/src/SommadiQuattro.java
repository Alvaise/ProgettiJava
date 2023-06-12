import java.util.Scanner;

public class SommadiQuattro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=0;
		int n;
		System.out.println("Inserire quattro numeri interi: ");
		for (int i = 0; i < 4; i++) {
			n=sc.nextInt();
			s+=n;
		}
		System.out.println("La somma è "+ s);
	}

}
