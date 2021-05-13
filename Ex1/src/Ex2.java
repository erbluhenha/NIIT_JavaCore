import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so:");
		int num = sc.nextInt();
		int binhPhuong = num * num;
		int lapPhuong = binhPhuong * num;
		System.out.println("Binh phuong:" + binhPhuong);
		System.out.println("Lap phuong:" + lapPhuong);
	}
}
