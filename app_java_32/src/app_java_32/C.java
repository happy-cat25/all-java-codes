package app_java_32;//explicit downcasting
                    //big to smol size
public class C {
	public static void main(String[] args) {
		long x = 10;//8 byte
		int y =(int)x;//4 byte
		System.out.println(y);
	}

}
