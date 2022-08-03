package p1;//Access specifiers for constructors

public class A {
	  public A() {//public constructor
		
	}
	public static void main(String[] args) {
		A a1 = new A();
	}

}
// 1. as if constructor is private we can't create object or cannot access it in same package or different one but only within that same class
//2. when its a default one objects can be created only within same class, same package and not in different package
//3. when its protected constructor its objects can be created only in same class,same package and not in different package.
//4. as for when its public constructor its object can be created in all 3.