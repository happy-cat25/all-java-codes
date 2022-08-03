package app_java_44;

//Mobile no validator of 10 digits
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		System.out.println("Enter mobile no:");
		Scanner s = new Scanner(System.in);
		String str = s.next();

		String regex = "[6-9][0-9][9]";

		if(str.matches(regex)){
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}

}
