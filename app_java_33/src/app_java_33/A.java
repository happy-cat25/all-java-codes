package app_java_33;//Try Catch block for exception handling

//Arithematic exception
public class A {
	public static void main(String[] args) {

		try {
			int x = 10;
			int y = 0;
			int z = x / y;// exception occurs here
			System.out.println(z);

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("henlo");
		System.out.println("waddup");
	}

}