package app_java_11;
// program showing INHERITANCE from class C inheriting values from both classes A and B


public class C extends B {
	public void test3() {
		System.out.println(3);
	}
	
	public static void main(String[] args) {
		
		C c1 = new C();
		c1.test1();
		c1.test2();
		c1.test3();
		
	}

}

