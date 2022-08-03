package app_java_36;
//to count and print no of words and words in a sentence
public class B {
	public static void main(String[] args) {
		String str = " what da dog doin test ";
		String[] s = str.trim().split(" ");
		System.out.println(s.length);

		for (String x : s) {
			System.out.println(x);
		}
	}

}
