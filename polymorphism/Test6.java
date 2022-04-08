package polymorphism;

class Animal{
}
class Monkey extends Animal{
	
}
public class Test6 {
	public void methodOne(Animal a) {
		System.out.println("Animal");
	}
	public void methodOne(Monkey m) {
		System.out.println("Monkey");
	}
	
	public static void main(String[] args) {
		Test6 t=new Test6();
		Animal a=new Animal();
		t.methodOne(a);//animal
		Monkey m=new Monkey();
		t.methodOne(m);//monkey
		Animal al=new Monkey();
		t.methodOne(al);//animal
	}

}
