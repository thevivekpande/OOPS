package oops;

public abstract class Engineer {
	String name;
	int idNo;
	Engineer(String name){
		this.name=name;
	}
	Engineer(String name, int idNo){
		this.name=name;
		this.idNo=idNo;
	}
	abstract void coding();
	public void testing() {
		System.out.println(name+" is testing the project.");
	}
}
