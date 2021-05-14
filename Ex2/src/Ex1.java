import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int diem;
		int bonus=0;
		String name,hang="";
		System.out.print("Nhập tên: ");
		name=sc.nextLine();
		System.out.print("Nhập điểm: ");
		diem=sc.nextInt();
		if(diem>=10 && diem <15) {
			bonus=1;
		}else if(diem<=20) {
			bonus=3;
		}else if(diem<25) {
			bonus=5;
		}else {
			bonus=0;
		}
		int temp=bonus+diem;
		if(temp>=0 && temp<10) {
			hang="D";
		}else if(temp<15) {
			hang="C";
		}else if(temp<20) {
			hang="B";
		}else if(temp<30) {
			hang="A";
		}else {
			hang="Khong hang";
		}
		System.out.println("Họ tên: "+name);
		System.out.println("Xếp loại: "+hang);
	}

}
