package Exercise4;



abstract class Parent{

	public void message() { 
		
		System.out.println("This is a method message");
	
	}
}
 class sub1 extends Parent{
	
	void method() {
		
		System.out.println("This is first subclass");
	}
}

class sub2 extends Parent{
	
	void method() {
		System.out.println("This is second subclass");		
	}
}
	
	


public class Question1 {

	public static void main(String[] args) {
		

		sub1 a = new sub1();
		sub2 b = new sub2();
		
		a.message();
		a.method();
		b.message();
		b.method();
	}

}
