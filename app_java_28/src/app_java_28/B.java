package app_java_28;//Lambda expression
                    //are used to reduce length of code.
public class B {
	public static void main(String[] args) {
		
		A a1=(int a, int b)->{
			System.out.println(a);
			System.out.println(b);
		};
		a1.test(22,76);
	}

}
