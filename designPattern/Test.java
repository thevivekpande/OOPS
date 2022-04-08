package designPattern;

final class Singleton {
	static Singleton s=new Singleton();
	
	private Singleton() {
		
		System.out.println("Object Created");
	}
	public static Singleton getObj() {
		return s;
	}
}



public class Test{
	public static void main(String[] args) {
		Singleton s1=Singleton.getObj();
		Singleton s2=Singleton.getObj();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}