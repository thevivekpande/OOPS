package designPattern;

import java.util.Scanner;

interface IICeCream{
	public int Add(int a, int b);
}
class SDAL implements IICeCream{
	@Override
	public int Add(int a, int b) {
		System.out.println("SDAL is running.");
		return a+b;
	}
}
class VDAL implements IICeCream{
	@Override
	public int Add(int a, int b) {
		System.out.println("VDAL is running.");
		return a+b;
	}	
}
class CDAL implements IICeCream{
	@Override
	public int Add(int a, int b) {
		System.out.println("CDAL is running.");
		return a+b;
	}
}
class BAL{
	IICeCream iceCream;
	BAL(IICeCream obj){
		iceCream=obj;
	}
	public int Add(int a, int b) {
		return iceCream.Add(a, b);
	}
}
class ServiceLocator{
//	private static int count=0;
	public static IICeCream GetObject(String type){
		if(type.equals("SDAL")) {
			return new SDAL();
		}else if(type.equals("VDAL")) {
			return new VDAL();
		}else if(type.equals("CDAL")) {
			return new CDAL();
		}
		return null;
	}
}
class PL{
	public void Add(int a, int b, String type) {
		BAL obj= new BAL(ServiceLocator.GetObject(type));
		int result=obj.Add(a, b);
		System.out.println(result);
	}
}
public class Program {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter type :");
		String type=scan.next();
		System.out.println("Enter a and b :");
		int a=scan.nextInt();
		int b=scan.nextInt();
		PL pl=new PL();
		pl.Add(a, b, type);
	}
}
