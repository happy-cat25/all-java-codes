package app_java_4;

public class B {
	static int r = 99;// static variable
	static B b3;// static reference variable
	static B b5;// static reference variable
	static B b4;// static reference variable
	int x = 10;// non static
	int y = 20;// non static

	public static void main(String[] args) {
		int p = 98;// local variable
		int q = 90;// local variable
		int id1 = 9;// local reference variable
		B b1 = new B();
		B b2 = new B();
		

		
		
		b3 = new B();
		// here if i don't create new object here in case here is b5 and b4 and still print in b5 and b3 in test() it will give default value NULL.
		b3.test();

		b4 = new B();
		// same here in test1() with b3 and b5 if i don't create objects it will return NULL.
		b4.test1();
		
		

		System.out.println(b1);//address
		System.out.println(b2);//address
		System.out.println(id1);// 9
		System.out.println(p);// 98
		System.out.println(q);// 90
		System.out.println(r);//99
		System.out.println(b1.x);//10
		System.out.println(b2.y);//20
		System.out.println(b3);//address
		System.out.println(b4);//address
		System.out.println(b5);//address
		

	}

	public void test() {
		System.out.println(b3);//address
		System.out.println(b5);//null
		System.out.println(b4);//null
		System.out.println(r);// 99

	}

	public void test1() {
		System.out.println(b4);//address
		System.out.println(b3);//null
		System.out.println(b5);//null

	}

}
