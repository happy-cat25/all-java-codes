package app_java_43;

import java.io.FileWriter;

public class E {
	public static void main(String[] args) throws Exception {//exception is thrown to object class

		C c1 = new C();
		
			c1.test();//thrown exception is here
	}		

	public void test() throws Exception {// Exception is thrown to PSVM(); main method
		FileWriter fw = new FileWriter("D://teft.txt");
	}

}
