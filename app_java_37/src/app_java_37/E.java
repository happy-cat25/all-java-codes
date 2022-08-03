package app_java_37;
//BufferedReader
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//buffered reader
public class E {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D://files//test.txt");
			BufferedReader br = new BufferedReader (fr);
			
			System.out.println(br.readLine());//exclusive to buffered reader
			System.out.println(br.readLine());
			System.out.println(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
