package designPattern;
class Computer{
	private String HDD;
	private String RAM;
	private boolean isGraphicCardEnabled;
	
	public String getHDD() {
		return HDD;
	}
	
	public String getRAM() {
		return RAM;
	}
	
	public boolean isGraphicCardEnabled() {
		return isGraphicCardEnabled;
	}
	
	private Computer(ComputerBuilder builder) {
		this.HDD=builder.HDD;
		this.RAM=builder.RAM;
		this.isGraphicCardEnabled=builder.isGraphicCardEnabled;
	}
	
	static class ComputerBuilder{
		private String HDD;
		private String RAM;
		private boolean isGraphicCardEnabled;
		
		public ComputerBuilder(String hdd, String ram) {
			this.HDD=hdd;
			this.RAM=ram;
		}
		
		public ComputerBuilder setGraphicCardEnabled(boolean isGraphicCardEnabled) {
			this.isGraphicCardEnabled=isGraphicCardEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
		
	}
}


public class BuilderPatternComputer {
	public static void main(String[] args) {
		Computer comp=new Computer.ComputerBuilder("1TB", "32GB").setGraphicCardEnabled(true).build();
		System.out.println(comp.getHDD());
		System.out.println(comp.getRAM());
		System.out.println(comp.isGraphicCardEnabled());
	}
}
