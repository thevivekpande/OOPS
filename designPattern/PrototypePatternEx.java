package designPattern;

class BasicCar{
	private String modelName;
	public int price;
	BasicCar(String modelName, int price){
		this.modelName=modelName;
		this.price=price;
	}
	
	public void setModelName(String modelName) {
		this.modelName=modelName;
	}
	
	public String getModelName(){
		return modelName;
	}
	
	public int SetPrice(int price) {
		this.price=price;
		return price;
	}
	
	public void show() {
		System.out.println("Car is : "+modelName+" and it's price is Rs."+price);
	}
	
    protected BasicCar clone() {
    	return new BasicCar(modelName, price);
    }
	
}

class Nano extends BasicCar {

	Nano(String modelName, int price) {
		super(modelName, price);
	}
	
}

class Ford extends BasicCar{

	Ford(String modelName, int price) {
		super(modelName, price);
		// TODO Auto-generated constructor stub
	}
	
}

public class PrototypePatternEx {

	public static void main(String[] args) {
		Nano nano=new Nano("Green Nano", 189818);
		Ford ford=new Ford("Yellow Ford", 561925);
		BasicCar nano2=nano.clone();
		nano.show();
		nano2.setModelName("Ford");
		nano2.SetPrice(43535);
		nano2.show();
		System.out.println(nano.hashCode() +"  "+ nano2.hashCode());
		ford.show();
	}

}
