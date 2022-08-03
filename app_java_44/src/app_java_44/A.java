package app_java_44;
// \\d= for finding digits, \\s= for white spaces,\\w=gives special chars and white spaces
////D=leaves out digits,\\S=leaves out white spaces,\\W=leaves both of them out
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//regular expessions
public class A {
	public static void main(String[] args) {
		
		Pattern p = Pattern .compile("[\\s]");
		Matcher m = p.matcher("a6b#@9 DcdeXt");
		
		while(m.find()) {
			System.out.println(m.start()+"...."+m.group());
		}
	}

}
