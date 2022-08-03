package app_java_7;// CONSTRUCTOR

public class A {
	A(char c, int x, double d) { // passing arguments in constructor, A () is a constructor
		System.out.println(c);
		System.out.println(x);
		System.out.println(d);
		System.out.println("hollow");
		
	}

	public static void main(String[] args) {

		A a1 = new A('x',24,3.7);
		
		
		

	}

}
