package app_java_44;
//counting words and printing "em using StringTokenizer.
import java.util.StringTokenizer;

//StringTokenizer
public class D {
	public static void main(String[] args) {
		int count = 0;
		StringTokenizer str = new StringTokenizer("Pranay N Gurnule Nagpur");

		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			count++;
		}System.out.println(count);
	}

}
