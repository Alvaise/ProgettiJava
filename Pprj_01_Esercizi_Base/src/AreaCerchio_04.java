import java.util.Scanner;

public class AreaCerchio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire raggio del cerchio");
		int r = sc.nextInt();
		double area = 2*r*Math.PI;
		System.out.println("L'area del cerchio di raggio "+r+" è "+area);
	}

}
