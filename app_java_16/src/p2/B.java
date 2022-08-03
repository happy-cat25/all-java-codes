package p2;

import p1.A;

public class B extends A {
	public void test() {
		System.out.println(569);//overriding test() with new value
	} 
	
	public void test1() {
		System.out.println(700);//overriding test1() with new value
	}

	public static void main(String[] args) {
		B b1 = new B();
		
		b1.test();
		b1.test1();
	}

}
// Extends keyword depicts Inheritance is used.
// 
