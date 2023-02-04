package com.builder.design_pattern;

public class Test {
	public static void main(String[] args) {
		
		User user = new User.UserBuilder("kiran", "Bhokare")
							.age(21)
							.build();
		
//		User user = new User.UserBuilder()
//							.firstName("firstName")
//							.build();
		
		System.out.println(user);

		Computer computer = new Computer.ComputerBuilder("1TB", "512GB", "8GB")
								  .isDiscDriveAvilable(false)
								  .isGraphicCardEnabled(true)
								  .build();
		
		System.out.println(computer);
	}
}
