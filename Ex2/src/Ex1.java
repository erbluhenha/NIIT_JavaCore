import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int diem;
		String name,hang="";
		System.out.print("Nhập tên: ");
		name=sc.nextLine();
		System.out.print("Nhập điểm: ");
		diem=sc.nextInt();
		if(diem>=0 && diem <10) {
			hang="D";
		}else if(diem<15) {
			hang="C";
		}else if(diem<20) {
			hang="B";
		}else if(diem<30) {
			hang="A";
		}
		System.out.println("Họ tên: "+name);
		System.out.println("Xếp loại: "+hang);
	}

}
