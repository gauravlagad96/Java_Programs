package com.thread;

class B extends Thread {

	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println(i);
				Thread.sleep(3000); // stop execution of program for 3 second
			}
		} catch (InterruptedException ex) {
			System.out.println(ex);
		}
	}
}

class C implements Runnable {

	@Override
	public void run() {
		try {

			for (int i = 0; i <= 50; i++) {
				System.out.println(i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

public class ThreadStopMethodApp {
	public static void main(String[] args) {
		B b = new B();
		b.start();

		C cd = new C();
		Thread th = new Thread(cd);// start() method is not available for a Runnable object directly.
		th.start();
	}

}
