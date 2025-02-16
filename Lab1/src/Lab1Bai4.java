import java.util.Scanner;

public class Lab1Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("a: ");
		double a = scanner.nextDouble();
		System.out.print("b: ");
		double b = scanner.nextDouble();
		System.out.print("c: ");
		double c = scanner.nextDouble();
		double Delta = Math.pow(b, 2) - 4 * a * c; 
		double CanDelta = Math.sqrt(Delta);
		System.out.printf("Delta: %f", CanDelta);
	}

}
