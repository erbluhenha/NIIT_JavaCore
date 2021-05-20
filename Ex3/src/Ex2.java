import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int arr[][]=new int[3][4];
    	int hang=arr.length;
    	int cot=arr[0].length;
    	for (int i = 0; i < hang; i++) {
    		for (int j = 0; j < cot; j++) {
    			System.out.print("a["+i+"]["+j+"] = ");
    			arr[i][j]=sc.nextInt();
			}
		}
    	int sum=0;
    	for (int i = 0; i < hang; i++) {
    		for (int j = 0; j < cot; j++) {
    			sum+=arr[i][j];
    			System.out.print(arr[i][j]+" ");
			}
    		System.out.println();
		}
    	System.out.println("Tong cac phan tu:"+sum);
    }

}