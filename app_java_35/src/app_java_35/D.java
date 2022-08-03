package app_java_35;

public class D extends C {
	D() {//super(); is here

		System.out.println("D");
	}

	D(int i) {//super(); is here automatically
		System.out.println(i);
	}

	public static void main(String[] args) {
		new D();//whenever object D is created is goes to empty body constructor
		new D(200);//it will go to no args constructor always hence from C is printed
	}

}
//Super(); isn't automatically kept when there are only constructors with args in parent class
//Super(); are placed automatically when in parent class there is a constructor with no args.



