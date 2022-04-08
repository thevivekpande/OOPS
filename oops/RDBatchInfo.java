package oops;

public class RDBatchInfo extends EpamEmployee {
	PracticeAllocated practice;
	Location location;
	private String DOB ;
	
	RDBatchInfo(String name,int age, PracticeAllocated practice, Location location){
		this.name=name;
		this.age=age;
		this.practice=practice;
		this.location=location;
	}
	
	public void printDetails(){
		System.out.println("Name : "+this.name + ", Age : "+this.age
				+", Practice Offered : "+this.practice+", Location : "+this.location);
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}
}
