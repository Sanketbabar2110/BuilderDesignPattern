package com.builder.design_pattern;

public class User {

	// All final attributes for immutable class
	// required
	private final String firstName;
	private final String lastName;

	// optional
	private final int age;
	private final String phone;
	private final String address;

	private User(UserBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.phone = builder.phone;
		this.address = builder.address;
	}

	@Override
	public String toString() {
		return "User: " + this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.phone + ", "
				+ this.address;
	}

	public static class UserBuilder {

		private String firstName;
		private String lastName;

		private int age;
		private String phone;
		private String address;

		 public UserBuilder(String firstName, String lastName) {
		 this.firstName = firstName;
		 this.lastName = lastName;
		 }

		public UserBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public UserBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}

		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}

		// Return the finally consrcuted User object
		public User build() {
			User user = new User(this);
			return user;
		}
	}
}