package com.leetcode.basic;

public class AddCommandLineArgApp {
	public static void main(String x[]) {
		int a, b, c;
		a = Integer.parseInt(x[0]);
		b = Integer.parseInt(x[1]);
		c = a + b;
		System.out.println("Addition of a and b is : " + c);

	}
}

/*
 * C:\sts\sts-workplace\core_java\src> javac com\basic\AddCommandLineArgApp.java
 * PS C:\sts\sts-workplace\core_java\src> java com.basic.AddCommandLineArgApp 5
 * 19 Addition of a and b is : 24
 */