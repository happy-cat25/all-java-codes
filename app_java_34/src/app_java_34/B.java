package app_java_34;
//Scanner class in java is just like printf(); in c
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scan.next();
		System.out.println("Your name is "+name);
		System.out.println("Enter your age:");
		int age = scan.nextInt();
		System.out.println("Your age is " +age);
		System.out.println("Enter your height:");
		float height = scan.nextFloat();
		System.out.println("Your height in feet is " +height);
	}

}
