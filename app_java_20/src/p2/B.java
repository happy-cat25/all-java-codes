package p2;

import p1.A;

public class B extends A{
	@Override
	public void test() {//public
		System.out.println(555);
	}
	public static void main(String[] args) {
		
		B b1 = new B();
		b1.test();
	}
	

}
