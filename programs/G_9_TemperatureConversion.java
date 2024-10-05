package com.programs;

import java.util.Scanner;

public class G_9_TemperatureConversion {
	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);

	        // Input temperature in Fahrenheit
	        System.out.print("Enter temperature in Fahrenheit: ");
	        double fahrenheit = scanner.nextDouble();

	        // Convert to Celsius
	        double celsius = (fahrenheit - 32) * 5 / 9;

	        // Convert to Kelvin
	        double kelvin = celsius + 273.15;

	        // Convert to Rankine
	        double rankine = fahrenheit + 459.67;

	        // Print the results
	        System.out.println("Temperature in Celsius: " + celsius);
	        System.out.println("Temperature in Kelvin: " + kelvin);
	        System.out.println("Temperature in Rankine: " + rankine);

	        scanner.close();
	    
	}

}

// Celsius=95​×(Fahrenheit−32)
// Kelvin=Celsius+273.15
// Rankine=Fahrenheit+459.67
