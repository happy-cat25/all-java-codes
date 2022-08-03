package app_java_38;
//f.createnewFile();
import java.io.File;
import java.io.IOException;

public class C {
	public static void main(String[] args) {
		File f = new File("D://files//test3.txt");
		try {
			boolean val = f.createNewFile();
			System.out.println(val);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
