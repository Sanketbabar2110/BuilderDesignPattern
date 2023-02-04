package com.builder.design_pattern;

public class Computer {

	//required fields
	private String hdd;
	private String ssd;
	private String ram;
	
	//optional fields
	private boolean isGraphicCardEnabled;
	private boolean isDiscDriveAvilable;
	
	public Computer(ComputerBuilder builder) {
		super();
		this.hdd = builder.hdd;
		this.ssd = builder.ssd;
		this.ram = builder.ram;
		this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
		this.isDiscDriveAvilable = builder.isDiscDriveAvilable;
	}

	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ssd=" + ssd + ", ram=" + ram + ", isGraphicCardEnabled="
				+ isGraphicCardEnabled + ", isDiscDriveAvilable=" + isDiscDriveAvilable + "]";
	}

	public static class ComputerBuilder {
		
		//required field
		private String hdd;
		private String ssd;
		private String ram;
		
		//Optional field
		private boolean isGraphicCardEnabled;
		private boolean isDiscDriveAvilable;
		
		public ComputerBuilder(String hdd, String ssd, String ram) {
			super();
			this.hdd = hdd;
			this.ssd = ssd;
			this.ram = ram;
		}
		
		public ComputerBuilder isGraphicCardEnabled(boolean b) {
			this.isGraphicCardEnabled = b;
			return this;
		}
		
		public ComputerBuilder isDiscDriveAvilable(boolean b) {
			this.isDiscDriveAvilable = b;
			return this;
		}
		
		public Computer build() {
			Computer computer = new Computer(this);
			return computer;
		}
	}
	
}
