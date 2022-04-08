package oops;
class A{
	public void temp(int a) {
		System.out.println("int argument");
	}
	
	public void temp(float a) {
		System.out.println("float");
	}
}

public class Test {
	public static void main(String[] args) {
		A a=new A();
		a.temp(10l);
//		a.temp('a');
//		a.temp(1.0);
		System.out.println();
	}
}
