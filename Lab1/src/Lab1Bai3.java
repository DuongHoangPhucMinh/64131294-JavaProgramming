import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Canh: ");
		double Canh = scanner.nextDouble();
		double TheTich = Math.pow(Canh, 3);
		System.out.printf("The tich hinh vuong: %f", TheTich);
	}
}
