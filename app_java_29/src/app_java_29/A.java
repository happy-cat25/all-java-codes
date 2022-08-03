package app_java_29;//unary operators 
                    // pre and post increment

public class A {
	int i =10;
	int j = ++i + i++ + i + i++;
	//      11 + 11   + 12 + 12 =46
	public static void main(String[] args) {
		
		A a1 = new A();
		System.out.println(a1.i);//13
		System.out.println(a1.j);//46
	}

}
