package app_java_44;
//a*= gives zero or group of occurences
//a+= gives at least one or group of occurences
//a?=will only gives singular occurences
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C {
public static void main(String[] args) {
		
		Pattern p = Pattern .compile("a+");
		Matcher m = p.matcher("aabbbaaabab");
		
		while(m.find()) {
			System.out.println(m.start()+"...."+m.group());
		}
	}
}
