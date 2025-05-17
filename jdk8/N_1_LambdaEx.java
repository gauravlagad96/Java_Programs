package com.leetcode.jdk8;

public class N_1_LambdaEx {
	public static void main(String[] args) {
		Runnable run = () -> {
			System.out.println("Thread is running...");

		};

//		creating and starting a thread
		Thread thread = new Thread(run);
		thread.start();
	}

}
//use lambda  interface to implementation of runnable interface;