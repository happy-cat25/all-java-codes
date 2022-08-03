package app_java_38;
//BufferedWriter
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class X {
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("D://files//test3.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(101);
			bw.newLine();//exclusive to buffered writer
			bw.write("gurnule");
			bw.newLine();

			char[] ch = { 'a' };
			bw.write(ch);

			bw.flush();
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
