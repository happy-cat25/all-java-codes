package app_java_37;
//Threading in java
public class A extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println("run");
		}
	}
	
	public static void main(String[] args) {
		A a1 = new A ();
		a1.start();
		for(int i=0;i<10000;i++) {
			System.out.println("main");
		}
	}

}
