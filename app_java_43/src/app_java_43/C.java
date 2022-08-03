package app_java_43;

import java.io.FileWriter;

//Throws Keyword 
//it's used to throw or pass an exception occuring to the calling statement
public class C {
	public static void main(String[] args) {

		C c1 = new C();
		
			c1.test();//thrown exception is here
	}		

	public void test() throws Exception {// Exception is thrown to PSVM(); main method
		FileWriter fw = new FileWriter("D://teft.txt");
	}

}
