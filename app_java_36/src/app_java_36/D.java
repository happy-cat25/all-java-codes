package app_java_36;
//immutable class
final public class D {
	private final int age;
	private final String name;
	
	 D(int age,String name){
		this.age=age;
		this.name=name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		D d1= new D(20,"xghdhd");
	}
	

}
