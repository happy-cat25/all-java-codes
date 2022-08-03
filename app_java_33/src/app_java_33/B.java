package app_java_33;

//Null pointer exception
public class B {

	static B b1;
	int x = 20;

	public static void main(String[] args) {
		try {

			System.out.println(b1.x);// B.x//exception here

		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println(44);

	}

}
