package app_java_1;

public class A {
	int x = 30;// non-static variable
	static int z = 50;// static variable

	public static void main(String[] args) {

		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		a3.test();

		System.out.println(a1.x);
		System.out.println(a2.x);
		System.out.println(A.z);
		System.out.println(z);

		A.z = 550;

		System.out.println(z);

	}

	public void test() {

		A a3 = new A();
		a3.x = 600;
		System.out.println(a3.x);

	}

}
