package com.assignment;

abstract class Staff {
	protected int id;
	protected String name;

	public Staff(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public abstract void display();
}

class OfficeStaff extends Staff {
	private String department;

	public OfficeStaff(int id, String name, String department) {
		super(id, name);
		this.department = department;
	}

	@Override
	public void display() {
		System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
	}
}

public class Main {
	public static void main(String[] args) {
		
		OfficeStaff[] staffList = { new OfficeStaff(1, "John", "HR"), new OfficeStaff(2, "Jane", "IT") };
			
		//for each loop is used for display
		for (OfficeStaff staff : staffList) {
			staff.display();
		}
	}
}
