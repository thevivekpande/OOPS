package polymorphism;

public class Test2 {
	public void methodOne(String s) {
		System.out.println("string version");
	}
	public void methodOne(Object o) {
		System.out.println("Object version");
	}
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.methodOne("Vivek");//string
		t.methodOne(new Object());//object
		t.methodOne(null);//string
	}

}
