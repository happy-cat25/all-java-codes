package app_java_38;
//f.delete();
import java.io.File;

public class B {
	public static void main(String[] args) {
		File f = new File("D://files1//test3.txt");
		boolean val =f.delete();
		System.out.println(val);
	}

}
