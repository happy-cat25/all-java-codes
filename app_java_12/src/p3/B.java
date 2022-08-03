package p3;


public class B {
	public static void main(String[] args) {
		p1.A a1 = new p1.A();//importing p1 
		p2.A a2 = new p2.A();//importing p2
		System.out.println(a1.y);//10
		System.out.println(a2.y);//200
	}

}
//if only p1 is imported only 10 is printed
//if only p2 is imported only 200 is printed for both
//if both p1 & p2 is imported as shown in this
//example then 10 & 200 will be printed
//as different values of y from separate packages
//namely as p1 and p2.