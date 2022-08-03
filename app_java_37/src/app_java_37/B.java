package app_java_37;
//Threading using only thread class 
public class B extends Thread {//run(),start()
	String name;

	B(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println(this.name);
		}

	}
}
