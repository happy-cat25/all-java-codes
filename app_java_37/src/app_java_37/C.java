package app_java_37;
//Thread using runnable class
public class C implements Runnable {//run()
	String name;

	C(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(this.name);
		}
	}

	public static void main(String[] args) {
		C c1 = new C("xxx");
		Thread t1 =new Thread(c1);
		t1.start();

		C c2 = new C("yyy");
		Thread t2 = new Thread(c2);
		t2.start();
	}

}
