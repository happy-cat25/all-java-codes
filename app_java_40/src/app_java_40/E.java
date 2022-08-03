package app_java_40;
//Thread priority

public class E extends Thread{
	String name;
	
	E(String name){
		this.name=name;
		
	}
	
  public static void main(String[] args) {
	  
	  E e1 = new E("xxxx");
	  E e2 = new E("yyyy");
	  e2.setPriority(1);//sets priority to 1 minimum
	  e1.setPriority(10);//sets priority to maximum which is 10
	  
	  System.out.println(e2.getPriority());
	  System.out.println(e1.getPriority());
	  e1.start();
	  e2.start();
  }	  
	  public void run() {
		  System.out.println(this.name);
	  }
}

