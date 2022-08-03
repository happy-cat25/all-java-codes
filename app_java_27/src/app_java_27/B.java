package app_java_27;//ENCAPSULATION
                    //wrapping up data with methods which operate on that data.
                    //restricting direct access to that data.
public class B {
	public static void main(String[] args) {
		
		A a1 = new A();
		a1.setId(55);
		int x = a1.getId();
		System.out.println(x);//55
		
		
	}

}
