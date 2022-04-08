package polymorphism;

public class Test5 {
	public void methodOne(int i) {
		System.out.println("general method");
	}
	public void methodOne(int ...i) {
		System.out.println("var-arg method");
	}
	public static void main(String[] args) {
		Test5 t=new Test5();
		t.methodOne();//var-arg
		t.methodOne(12,23);//var-arg
		t.methodOne(1);//int
	}

}
