package p4;

class A{
	A()
	{
		System.out.println("A");
	}
}
class B extends A{
	
	public B(){
		
	}
	public B(int x) {
		System.out.println("B");
	}
	public B(char x) {
		System.out.println("B");
	}
	public B(int x,char ch) {
		System.out.println("B");
	}
	
}
class C extends B{
	public C() {
		System.out.println("C");
	}
}

public class DemoApp {

	public static void main(String[] args) {
		
		C obj = new C();
	}
}
