package designPattern;

interface IBuilder{
	void BuildBody();
	void InsertWheels();
	void AddHeadlights();
	Product GetVehicle(); 
}

class Product{
	String product;

	public void Add(String str) {
		this.product=str;
	}
	public void Show() {
	
	}
}


class Car implements IBuilder{

	@Override
	public void BuildBody() {
		System.out.println("Car body is build.");
	}

	@Override
	public void InsertWheels() {
		// TODO Auto-generated method stub
		System.out.println("4 wheels are inserted");
	}

	@Override
	public void AddHeadlights() {
		// TODO Auto-generated method stub
		System.out.println("2 headLights are added.");
	}

	@Override
	public Product GetVehicle() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class MotorCycle implements IBuilder{

	@Override
	public void BuildBody() {
		// TODO Auto-generated method stub
		System.out.println("MotorCycle is Build.");
	}

	@Override
	public void InsertWheels() {
		// TODO Auto-generated method stub
		System.out.println("2 wheels are inserted.");
	}

	@Override
	public void AddHeadlights() {
		// TODO Auto-generated method stub
		System.out.println("1 headLights is added.");
	}

	@Override
	public Product GetVehicle() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class Director{
	Director(){
	
	}
	public void Construct(IBuilder ibuilder) {
		ibuilder.BuildBody();
		ibuilder.InsertWheels();
		ibuilder.AddHeadlights();
		ibuilder.GetVehicle();
		
	}
}


public class BuilderPatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director=new Director();
		Car car=new Car();
		director.Construct(car);
		
		MotorCycle motorcycle=new MotorCycle();
		director.Construct(motorcycle);
	};

}
