import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập điểm: ");
		int diem = sc.nextInt();
		String hang = "";
		if (diem < 0 || diem > 10) {
			return;
		}
		switch (diem) {
		case 5:
		case 6:
			hang = "trung bình";
			break;
		case 7:
		case 8:
			hang = "khá";
			break;
		case 9:
		case 10:
			hang = "giỏi";
			break;
		default:
			hang = "yeu";
			break;
		}
		System.out.println("Xếp loại " + hang);
	}

}
