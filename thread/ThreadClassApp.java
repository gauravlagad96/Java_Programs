package com.thread;

class A extends Thread {
	public void run() {
		
		System.out.println("I am a run method of thread class");
	}
}

public class ThreadClassApp {
	public static void main(String[] args) {

		A a = new A();
		a.start();

	}

}
