package polymorphism;

public class Test3 {
	public void methodOne(String s) {
		System.out.println("String hai main");
	}
	public void methodOne(StringBuffer s) {
		System.out.println("StringBuffer hai main");
	}
	public static void main(String[] args) {
		Test3 t=new Test3();
		t.methodOne("Vivek");//string
		t.methodOne(new StringBuffer("Vivek"));//StringBuffer
//		t.methodOne(null);//CE ambigous
	}
}
