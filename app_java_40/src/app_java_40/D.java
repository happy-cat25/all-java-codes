package app_java_40;
//Thread Lifecycle

public class D extends Thread {
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println(d1.getState());
		d1.start();

		try {
			Thread.sleep(5000);// putting thread in a sleep
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(d1.getState());// gets status of d1

	}

	public void run() {

		System.out.println("TEST");

	}

}
