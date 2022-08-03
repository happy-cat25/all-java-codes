package app_java_7; // STATIC METHOD of passing arguments in a function

public class Q {
	public static void main(String[] args) {
		
		int g =Q.test(77,'k',9.8);//passing parameters to test() of type int, char , double
		System.out.println(g);
	}
	
	public static int test(int x, char c, double d) {
		System.out.println(x);
		System.out.println(c);
		System.out.println(d);
		System.out.println(675);
		return 999;
	}

}
