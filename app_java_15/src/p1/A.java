package p1;//DATA HIDING

public class A {
	
private int x = 10;
public static void main(String[] args) {
	A a1 = new A();
	System.out.println(a1.x);
}
}
//Here if we make variable X private it can be accessed in only same class
//and cannot in same package or different package.
//thats's the whole point of data hiding


