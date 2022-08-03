package app_java_33;

//Number format exception
public class C {
	public static void main(String[] args) {
		try {
			String x = "yt";
			int val = Integer.parseInt(x);// exception here
			System.out.println(val);

		} catch (NumberFormatException e) {
			e.printStackTrace();

		}
		System.out.println(145);

	}

}
