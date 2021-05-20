import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap chuoi:");
		String str=sc.nextLine();
		
		int len=str.length();
		System.out.println("Do dai chuoi: " +len);
		if(len>3) {
			System.out.println("Ky tu o vi tri thu 3 trong chuoi: "+str.charAt(2));
		}
		System.out.println("Chi so cua ky tu 'a' trong chuoi: "+str.indexOf('a'));
		System.out.println("Thay the cac ky tu 'a' thanh 'b': "+str.replace('a', 'b'));
		int count=0;
		for (int i = 0; i < len; i++) {
			if(str.charAt(i)=='c') {
				count++;
			}
		}
		System.out.println("Tong so ki tu 'c' trong chuoi: "+count);
		System.out.println("Chuoi viet hoa: "+str.toUpperCase());
		System.out.println("Chuoi viet thuong: "+str.toLowerCase());
		System.out.println("Cat khoang trang hai ben: "+str.trim());
		if(len>5) {
		System.out.println("Chuoi con trong chuoi, bat dau tu ky tu thu 5: "+str.substring(4));
		}
		int nguyenAm=0,phuAm=0;
		char charStr[]=str.toLowerCase().toCharArray();
		for (char c : charStr) {
			if(c=='u'||c=='e'||c=='o'||c=='a'||c=='i') {
				nguyenAm++;
			}else if(c<='z' && c>='a') {
				phuAm++;
			}
		}
		System.out.println("So nguyen am: "+nguyenAm);
		System.out.println("So phu am: "+phuAm);
		System.out.println("Noi chuoi: "+str.concat("Programming"));
		System.out.println("Chi so cuoi cung cua chuoi \"abc\": "+str.lastIndexOf("abc"));
		
		System.out.print("Nhap chuoi moi:");
		String newString=sc.nextLine();
		boolean compare=str.equals(newString);
		if(compare) {
			System.out.println("2 chuoi bang nhau");
		}else {
			System.out.println("2 chuoi ko bang nhau");
		}
		
	}

}
