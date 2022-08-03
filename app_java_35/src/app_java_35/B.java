package app_java_35;
//
//super keyword
public class B extends A {
	B() {// super(); is placed here automatically
		System.out.println("B");
	}

	B(int i) {// super(); isn't placed here automatically

		this();
		System.out.println(i);
	}

	public static void main(String[] args) {
		new B(100);
	}

}
//when this (); is used in child class constructor then
//in that super isn't automatically placed


