package app_java_7;    //CONTRUCTOR OVERLOADING by different types/numbers of arguments

public class B {
	B(String str) {// different no of argument
		System.out.println(str);

	}

	B(double x, char c) {// diffrent types of arguments
		System.out.println(x);
		System.out.println(c);
	}

	B(int x, int y) {// same type of arguments
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		B b1 = new B("kolaba");
		B b2 = new B(55.8,'j');
		B b3 = new B(45, 76);
	}

}
