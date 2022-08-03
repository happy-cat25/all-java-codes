package app_java_38;
//f.length();
import java.io.File;

public class F {
	public static void main(String[] args) {
		File f = new File("D://files//test.txt");
		long val = f.length();
		System.out.println(val);
	}

}
