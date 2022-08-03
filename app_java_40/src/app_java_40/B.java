package app_java_40;
//wait(); and notify(); keywords
public class B {
	public static void main(String[] args) {
		C c1 = new C();
		c1.start();

		synchronized (c1) {
			try {
				c1.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println(c1.total);
	}

}
