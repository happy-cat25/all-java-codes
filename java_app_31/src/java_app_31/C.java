package java_app_31;

public class C extends B {

	@Override
	public void test2() {
		System.out.println(1);

	}

	@Override
	public void test1() {
		System.out.println(2);

	}

	public static void main(String[] args) {
		C c1 = new C();
		c1.test1();
		c1.test2();

	}

}
