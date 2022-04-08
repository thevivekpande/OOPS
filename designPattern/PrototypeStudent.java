package designPattern;

import java.util.Scanner;

interface Prototype{
	Prototype getClone();
}

class Student implements Prototype{
	private int roll;
	private String name, clgName, mobile;
	
	public Student(int roll, String name, String clgName, String mobile) {
		this.roll=roll;
		this.name=name;
		this.clgName=clgName;
		this.mobile=mobile;
	}
	
	void show() {
		System.out.println("Roll : "+roll);
		System.out.println("Name :"+name);
	    System.out.println("College Name :"+clgName);
		System.out.println("Mobile :"+mobile);
	}
	
	@Override
	public Prototype getClone() {
		return new Student(roll, name, clgName, mobile);
	}
}

public class PrototypeStudent {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter roll No.");
		int rollNo=scan.nextInt();
		System.out.println("Enter name");
		String name=scan.next();
		System.out.println("Enter college");
		String collegeName=scan.next();
		System.out.println("Mobile number");
		String mobileNumber=scan.next();
		
		Student s1=new Student(rollNo, name, collegeName, mobileNumber);
		s1.show();
		System.out.println(s1);
		
		Student s2=(Student) s1.getClone();
		s2.show();
		System.out.println(s2);
	}
}
