package app_java_38;
//f.list();
import java.io.File;

public class E {
	public static void main(String[] args) {
		File f = new File("D://files");
		String[] names = f.list();

		for (String s : names) {
			System.out.println(s);
		}
		System.out.println(names.length);
	}

}
