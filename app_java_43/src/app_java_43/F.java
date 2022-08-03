package app_java_43;

import java.util.Scanner;

//Throw Keyword
//it helps in creating customized exception
public class F {
	public static void main(String[] args) {
		int balance = 500;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amount:");
		int amount = s.nextInt();

		if (balance > amount) {
			System.out.println("please collect your cash");
		} else {

			try {
				throw new InsufficientFunds();// custom exception
			} catch ( InsufficientFunds e) {
				e.printStackTrace();
				
			}
			System.out.println("low balance");

		}
	}

}
