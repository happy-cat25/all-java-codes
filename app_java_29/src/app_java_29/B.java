package app_java_29;// pre and post decrement

public class B {
	int i = 10;
	int j = --i + i + i-- + --i;//9+9+9+7=34
	//      --10=9   + 9  + 9-- + --8=7
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.i);//7
		System.out.println(b1.j);//34
	}

}
