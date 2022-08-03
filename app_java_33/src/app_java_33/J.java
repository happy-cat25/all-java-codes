package app_java_33;
//if-else with scanner class
import java.util.Scanner;

public class J {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x = scan.nextInt();
		
		if(x>100) {
			System.out.println("A");
		}else if(x>200) {
			 System.out.println("B");
		}else {
			System.out.println("C");
		}
		
	}

}
