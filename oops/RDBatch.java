package oops;

public class RDBatch {
	public static void main(String args[]) {
		RDBatchInfo Intern1=new RDBatchInfo("Vivek Pandey", 22, 
				PracticeAllocated.DEP, Location.Hyderabad);
		Intern1.printDetails();
		Intern1.setDOB("09/02/2000");
		System.out.println("DOB:"+Intern1.getDOB());
	}
}
