package polymorphism;

public class Test4 {
	public void methodOne(int i, float f) {
		System.out.println("int-float method");
	}
	public void methodOne(float f, int i) {
		System.out.println("float-int method");
	}
	public static void main(String[] args) {
		Test4 t=new Test4();
		t.methodOne(0, 0.1f);//int-float
		t.methodOne(0.2f, 0);//float-int
//		t.methodOne(0, 0);//CE ambigous
//		t.methodOne(0.3f, 0.4f);//CE-
	}

}
