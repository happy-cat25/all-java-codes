//CONSTRUCTOR CHAINING using THIS() keyword
//this.MemberName is used to access non static members
//this() -> calls constructor
// while using this(); in another constructor make sure it should be the first statement or else it will /not work/ or show error


public class E {
	E(){//7
		System.out.println(400);//8 - ->1st it will print 400
	}//9
	
	E(int x){//5
		this();//6
		System.out.println(x);//10- -> 2nd it will print 300
	}//11
	E(int x, int y){//3
		this(300);//4
		System.out.println(x);//12 - -> 3rd it will print 200
		System.out.println(y);//13 - -> 4th it will print 100
		
		
	}//14
	public static void main(String[] args) {//1
		E e1 = new E(200,100);//2
	
		
	}//15 
	

}
