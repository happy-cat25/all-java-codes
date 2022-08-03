package app_java_35;

public class F extends E {
	F() {
		super(500);//explictly written
		System.out.println("B");
	}

	public static void main(String[] args) {
		new F();
	}

}
//here there is no no args constructor in parent Class E so we will have to write super(500);
//manually in child class to make this program work.
//or if we don't write it manually in child class constructor it will give error.


