import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float num1, num2, num3;
		System.out.print("Nhap so thu nhat:");
		num1 = sc.nextFloat();
		System.out.print("Nhap so thu hai:");
		num2 = sc.nextFloat();
		System.out.print("Nhap so thu ba:");
		num3 = sc.nextFloat();
		float sum = num1 + num2 + num3;
		float tbc = sum / 3;
		System.out.println("Tong: " + sum);
		System.out.println("Trung binh: " + tbc);
	}

}
