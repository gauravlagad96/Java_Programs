package com.programs;
/*
 Resistance= voltage/current
 current= voltage/resistance
 voltage = current * resistance
 
 */

import java.util.Scanner;

public class G_10_CalculateVoltageCurrentResistance  {
	public static void main(String[] args) throws Exception{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current and voltage");
		int voltage = sc.nextInt();
		int Current = sc.nextInt();
		int Resistance=voltage/Current;
		
		Current = voltage/Resistance;
		voltage = Current* Resistance;
		System.out.println("Resistance :" +Resistance + "  Current :" + Current + "  Voltage :" + voltage);
		
		
	}

}
