package app_java_38;

//f.exists();
import java.io.File;

public class A {
	public static void main(String[] args) {
		File f = new File("D://files1//test3.txt");
		boolean val = f.exists();
		System.out.println(val);
	}

}
