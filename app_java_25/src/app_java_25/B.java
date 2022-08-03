package app_java_25;//final keyword in class

public class B extends A{//inheritance won't take place 
	
	@Override
	public void test() {//if we make method final then it can't be overriden
		System.out.println(1000);
	}
	public static void main(String[] args) {
	 final int x=11;//if we make value of x final then it cannot be changed
	 int x = 34;//error
	 
	 
	  
	}

}
