package app_java_30;//abstract class

abstract public class A {//Abstract Class
	int x = 10;
	static int y = 20;
	
	abstract public void test1();//abstract incomplete method
    public void test2() {//non-static complete method
    	System.out.println(100);
    }
    
    public static void test3() {//static complete method
    	System.out.println(200);
    }
    
    public static void main(String[] args) {
		A a1 = new A ();//cannot create object in abstract class
	}
    
}
