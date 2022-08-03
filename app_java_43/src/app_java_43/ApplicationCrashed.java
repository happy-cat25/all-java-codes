package app_java_43;
//custom exception application crashed
public class ApplicationCrashed extends Throwable {
	public static void main(String[] args)  {
		
	}
	
	{
	try {	
		throw new ApplicationCrashed();
	}catch (ApplicationCrashed e) {
		System.out.println(e);
		System.out.println("Application crashed");
	}
}
}
	


