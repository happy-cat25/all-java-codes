package app_java_38;

//FileWriter
import java.io.FileWriter;
import java.io.IOException;

public class H {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D://files//test2.txt");
			fw.write(100);
			fw.write("pranay");
			fw.write("123");

			char[] ch = { 'q', 'w', 'e', 'r', 't', 'y' };
			fw.write(ch);

			fw.flush();
			fw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
