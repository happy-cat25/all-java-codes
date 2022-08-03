package app_java_8;

public class B extends A {
	public static void main(String[] args) {
		
		B b1 = new B();
		b1.x = 20;// changing value of x to 20
		System.out.println(b1.x);//20
		
		A a1 = new A ();
		System.out.println(a1.x);//10
	}

}
