package designPattern;
//
//import designPattern.Singleton1.SubClass;
//
// class Singleton1{
//	static Singleton1 singleton;
//	private Singleton1() {
//		System.out.println("Object created...");
//	}
//	
//	class SubClass extends Singleton1{
//		
//	}
//	
//	public static Singleton1 getObj() {
//		if(singleton==null) {
//			synchronized(Singleton1.class) {
//				if(singleton==null) {
//					singleton=new Singleton1();
//				}
//			}
//	    }
//		return singleton;
//	}
//}


//final class Singleton1{
//	static Singleton1 singleton1;
//	private Singleton1() {
//		System.out.println("Object has been created..");
//	}
//	
//	//method 1 double check locking
//	public static Singleton1 getObj() {
//		if(singleton1==null) {
//			synchronized(Singleton1.class) {
//				if(singleton1==null) {
//					singleton1=new Singleton1();
//				}
//			}
//		}
//		return singleton1;
//	}
//	
//	//method 2 locking, but costlier than method 1
//	public static synchronized Singleton1 getObj1() {
//		if(singleton1==null) {
//			singleton1=new Singleton1();
//		}
//		return singleton1;
//	}
//	
//	//method 3, no locking, may create problem during multithreaded invironmnet
//	public static Singleton1 getObj2() {
//		if(singleton1==null) {
//			singleton1=new Singleton1();
//		}
//		return singleton1;
//	}
//}

final class Singleton1{
	private static volatile Singleton1 singleton1;
	private Singleton1() {
		System.out.println("Object has been created..");
	}
	
	//method 1 double check locking
	public static Singleton1 getObj() {
		if(singleton1==null) {
			//t1 t2 t3
			synchronized(Singleton1.class) {
				if(singleton1==null) {
					singleton1=new Singleton1();
				}
			}
		}
		return singleton1;
	}
	
	//method 2 locking, but costlier than method 1
	public static synchronized Singleton1 getObj1() {
		if(singleton1==null) {
			singleton1=new Singleton1();
		}
		return singleton1;
	}
	
	//method 3, no locking, may create problem during multithreaded invironmnet
	public static Singleton1 getObj2() {
		if(singleton1==null) {
			singleton1=new Singleton1();
		}
		return singleton1;
	}
}


public class DoubleLockingSingleton {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Singleton1 s1=Singleton1.getObj();
		Singleton1 s2=Singleton1.getObj();
//		Singleton1.SubClass s3=s2.new SubClass();
		System.out.println(s1);
		System.out.println(s2);
//		System.out.println(s3);
	}

}
