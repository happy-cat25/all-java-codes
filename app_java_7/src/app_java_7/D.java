package app_java_7;  // 'THIS' KEYWORD

public class D {
	int i =187;// non-static variable
	public static void main(String[] args) {
		
		D d1 = new D();
		System.out.println(d1.i);//187
		System.out.println(d1);//address
		
		d1.test();
	}
	public void test()
	{
		System.out.println(this.i);// we can access non static members of class by using THIS keyword //187
		System.out.println(this);//address of d1 (same address)
		this.test1();// calling test1() with THIS keyword
	}
	
	public void test1()
	{
		System.out.println(7999);
	}

}
