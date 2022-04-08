package oops;

public class Developer extends Engineer {
	@Override
	void coding() {
		System.out.println(name+" is coding");
	}
	
	Developer(String name) {
		super(name);
	}
	Developer(String name, int idNo){
		super(name, idNo);
	}

	public static void main(String args[]) {
		Developer d1=new Developer("Vivek Pandey");
		d1.coding();
		d1.testing();
		
		Developer d2=new Developer("Vivek", 123);
		d2.coding();
		d2.testing();
		
	}

}
