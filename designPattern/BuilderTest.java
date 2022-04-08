package designPattern;

import designPattern.Computer1.Builder;

class Computer1{
	private String HDD;
	private String RAM;
	private boolean isGRaphicsCardEnabled;
	private Computer1(Builder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGRaphicsCardEnabled = builder.isGRaphicsCardEnabled;
	}
	public String getHDD() {
		return HDD;
	}
	public static Builder builder() {
		return new Builder();
	}
	public static final class Builder {
		private String HDD;
		private String RAM;
		private boolean isGRaphicsCardEnabled;

		Builder() {
		}

		public Builder setHDD(String HDD) {
			this.HDD = HDD;
			return this;
		}

		public Builder setRAM(String RAM) {
			this.RAM = RAM;
			return this;
		}

		public Builder setIsGRaphicsCardEnabled(boolean isGRaphicsCardEnabled) {
			this.isGRaphicsCardEnabled = isGRaphicsCardEnabled;
			return this;
		}

		public Computer1 build() {
			return new Computer1(this);
		}
	}		
}

public class BuilderTest {
	public static void main(String[] args) {
		Computer1 computer = new Computer1.Builder().setHDD("4GB").build();
		System.out.println(computer.getHDD());
	}
}
