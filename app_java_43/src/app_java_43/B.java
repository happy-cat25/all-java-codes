package app_java_43;
//finalize() is stored in Object class which is supermost class is JAVA 
//it is implemented for garbage collection when a object created isn't in use.
public class B extends Object{
	
	protected void finalize() {
		System.out.println(1000);
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		b1=null;
		System.gc();
	}

}
