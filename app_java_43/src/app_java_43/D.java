package app_java_43;

import java.io.FileWriter;

public class D {
	public static void main(String[] args) {

		C c1 = new C();
		
			try {
				c1.test();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}		

	public void test() throws Exception {// Exception is thrown to PSVM(); main method
		FileWriter fw = new FileWriter("D://teft.txt");
	}

}
