package app_java_35;

public class K extends I {
	public static void main(String[] args) {
		K k1 = new K();
		k1.test();
	}

	public void test() {
		System.out.println(super.i);
		System.out.println(super.j);
		super.xyz();

	}

}
//using super we can access non static & static variables
//as well as methods 




