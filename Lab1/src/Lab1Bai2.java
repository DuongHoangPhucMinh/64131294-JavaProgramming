import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chieu dai: ");
		double cD = scanner.nextDouble();
		System.out.print("Chieu rong: ");
		double cR = scanner.nextDouble();
		double Chuvi = (cD + cR)*2; 
		double DienTich = cD * cR;
		double CanhNhoNhat = Math.min(cD, cR);
		System.out.printf("Chu vi hinh chu nhat: %f\nDien tich hinh chu nhat: %f\nCanh nho nhat cua hinh chu nhat: %f", Chuvi, DienTich, CanhNhoNhat );
	}
}
