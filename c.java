package geekstar;
import java.util.Scanner;
public class c {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int i=scan.nextInt();
		long a=i;
		float f=a;
		
		System.out.println("Int value "+i); 
        System.out.println("Float value" +f); 
        scan.close();
	}
}
