package com.assignment;

interface Operation {
	double PI = 3.142;

	double area();

	double volume();
}

class Cylinder implements Operation {
	private double radius;
	private double height;

	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double area() {
		return 2 * PI * radius * (radius + height);
	}

	@Override
	public double volume() {
		return PI * radius * radius * height;
	}
}

public class InterfaceApp {
	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(5, 10);
		System.out.println("Area: " + cylinder.area());
		System.out.println("Volume: " + cylinder.volume());
	}
}
