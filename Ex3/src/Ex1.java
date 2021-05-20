import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu:");
		int n=sc.nextInt();
		double arr[] = new double[n];
		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			arr[i] = sc.nextDouble();
		}
		double max = arr[0], min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Phan tu max:" + max);
		System.out.println("Phan tu min:" + min);
		double sum = 0, count1 = 0, count2 = 0, count3 = 0, tich = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				sum += arr[i];
				count1++;
			}
			if (arr[i] == max) {
				count2++;
			}
			if (arr[i] % 3 == 0) {
				count3++;
			}
			tich *= arr[i];
		}
		if (count1 != 0) {
			System.out.println("Trung binh cong:" + sum / count1);
		}

		System.out.println("So phan tu co gia tri bang phan tu max:" + count2);
		System.out.println("Tich cac phan tu:" + tich);
		System.out.println("So phan tu chia het cho 3:" + count3);

	}

}
