package solid;

import java.util.Scanner;

interface Side {
	public void area();
}

class Circle implements Side{
	@Override
	public void area() {
		System.out.println("Enter radius");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println("Area of radius "+ a+" = "+(3.14 * a *a));
	}
}
class Square implements Side{
	@Override
	public void area() {
		System.out.println("Enter side");
		Scanner scan=new Scanner(System.in);
		int a =scan.nextInt();
		System.out.println("Area of side "+a+" = "+(a*a));	
	}
}
class Rectangle implements Side{

	@Override
	public void area() {
		System.out.println("Enter height and width");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Area of rectangle of height "+a+" and width "+b+" = " + a*b);
	}
	
}
public class Area {
	public static void main(String args[]) {
		Circle circle=new Circle();
		circle.area();
		Square square=new Square();
		square.area();
		Rectangle rectangle=new Rectangle();
		rectangle.area();
	}
}
