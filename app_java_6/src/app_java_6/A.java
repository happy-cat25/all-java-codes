package app_java_6;

public class A {
	static int c = 77;// static or global variable

	public static void main(String[] args) {
		int z = 9;// local variable
		A a1 = new A();//creating new object
		String x = a1.test(599,777);// "folded" is stored in x , passing 2 values as parameters to arguments a and b of test();
									 // variable x is local

		System.out.println(a1);// address
		System.out.println(z);// 9
		System.out.println(x);// "folded"

	}

	public String test(int a, int b) {// return type is int for arguments a and b of test(); {
		System.out.println(A.c);// 77
		System.out.println(a);//
		System.out.println(b);//
		return "folded";// returning string "folded" to a1.test() where its called and storing it in x
						// whose type is string

	}

}
