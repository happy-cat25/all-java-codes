package app_java_34;
//if else statements using a value from user.
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x = scan.nextInt();

		if (x > 100) {
			System.out.println("A");
		}else if (x > 200) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}

	}

}
