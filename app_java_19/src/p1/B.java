package p1;

public class B extends A {
	@Override
	public void test() {//public
		System.out.println(500);
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();
		
	}

}
