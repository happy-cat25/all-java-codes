package app_java_38;
//FileReader fr
import java.io.File;

import java.io.FileReader;

public class G {
	public static void main(String[] args) {
		File f = new File("D://files//test1.txt");
		try {
			FileReader fr = new FileReader(f);
			for (int i = 0; i < f.length(); i++) {
				System.out.println((char) fr.read());
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
