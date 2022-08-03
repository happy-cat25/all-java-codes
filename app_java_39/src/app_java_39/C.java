package app_java_39;
//Deserialization of Object(created) state which was stored paramanantely into a file in binary format
//back into object a2.
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class C {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("D://ObjectFile.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			A a2 = (A) ois.readObject();//Here class typecasting from java.lang.Object which is a Super(most)class in JAVA by default to child class A
			System.out.println(a2.id);
			System.out.println(a2.city);
			System.out.println(a2.password);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
