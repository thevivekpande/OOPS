package structuralPatterns;

abstract class Vehicle{
	protected Workshop workshop1;
	protected Workshop workshop2;
	protected Vehicle(Workshop workshop1, Workshop workshop2) {
		this.workshop1=workshop1;
		this.workshop2=workshop2;
	}
	abstract public void manufacture();
}

class Car extends Vehicle{	
	protected Car(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}
	@Override
	public void manufacture() {
		System.out.print("Car");
		workshop1.work();
		workshop2.work();
	}
}


class Bike extends Vehicle{
	protected Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}
	@Override
	public void manufacture() {
		System.out.print("Bike");
		workshop1.work();
		workshop2.work();
	}	
}

interface Workshop{
	abstract public void work();
}

class Produce implements Workshop{
	@Override
	public void work() {
		System.out.print(" Produced");
	}
}

class Assemble implements Workshop{

	@Override
	public void work() {
		System.out.print(" and Assembled");
		System.out.println();
	}
	
}

public class BridgeTest {
	public static void main(String[] args) {
		Vehicle v1=new Car(new Produce(), new Assemble());
		v1.manufacture();
		Vehicle v2=new Bike(new Produce(), new  Assemble());
		v2.manufacture();
	}
}
