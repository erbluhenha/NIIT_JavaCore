import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tong = 0, n = 0;
		for (int i = 201; i <= 600; i += 3) {
			tong += i;
			n++;
		}
		float tb = (float) (tong) / n;
		System.out.println("Tong: " + tong);
		System.out.println("Trung binh: " + tb);

		for (int i = 50; i <= 100; i++) {
			if (i % 7==0 && i%2!=0) {
				System.out.print(i + " ");
			}
		}
		int i = 20;
		System.out.println();
		System.out.print("Số lẻ: ");
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}
