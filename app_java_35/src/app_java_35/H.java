package app_java_35;

public class H extends G {
	H(int i) {
		// super (); is added by compiler
		System.out.println(i);
	}

	public static void main(String[] args) {
		new H(100);
	}

}

//here is in parent class there is no args constructor present
//super(); is placed by compiler in child class constructor. 




