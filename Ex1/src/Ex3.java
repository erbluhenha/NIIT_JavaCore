import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("So chan");
		} else {
			System.out.println("So le");
		}
	}
}
