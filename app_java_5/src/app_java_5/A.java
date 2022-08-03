package app_java_5;

public class A {
	static A a1;// static reference variable
	static A a2;// SRV
	static A a3;// SRV

	public static void main(String[] args) {
		a1 = new A();//here i haven't created new objects that's why a2 and a3 will return NULL 
		a1.test();
		
		System.out.println(a1);//Address
		System.out.println(a2);//null
		System.out.println(a3);//null
		

	}
	public void test() { 
		System.out.println(a1);//Address
		System.out.println(a2);//null
		System.out.println(a3);//null
				
		
	}

	 
	
	

}
