package app_java_7;// NON - STATIC METHOD of passing multiple chars (arguments) in fuction

public class Z {
	
	public static void main(String[] args) {
		
		Z z1 = new Z();
	    int p = z1.test('q','w','k');//multiple values passed
		System.out.println(p);
	}	
	public int test(char ... c)
	{
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		
	
		return 25;
		
		
	}

}
