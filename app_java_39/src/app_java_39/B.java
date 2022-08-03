package app_java_39;
//Serialization of Object(created) state paramanantely in a file in binary  (0's & 1's)

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class B {
	public static void main(String[] args) {
		A a1 = new A();

		try {
			FileOutputStream fos = new FileOutputStream("D://ObjectFile.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a1);

			oos.close();
			fos.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
