package polymorphism;

public class Test1 {
	public void methodOne(int i) {
		System.out.println("int-argument method");
	}
	public void methodOne(float f) {
		System.out.println("float-argument method");
	}
	public static void  main(String[] args) {
		Test1 t=new Test1();
		t.methodOne('c');//int
		t.methodOne(11l);//float
//		t.methodOne(12.3);
	}
}
