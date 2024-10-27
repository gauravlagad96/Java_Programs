package com.thread;

class IsAliveEx extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 9; i++) {
				System.out.println("Thread 1 " + isAlive());
				System.out.println(i);
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

class JoinMethodEx extends Thread {
	public void run() {
		try {
			for (int i = 0; i < 9; i++) {
				System.out.println("Thread 2  " + isAlive());
				System.out.println(i);
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

public class ThreadJoinAliveMethodApp {
	public static void main(String[] args) throws InterruptedException {
		IsAliveEx obj = new IsAliveEx();
		obj.start();
		obj.join();
		System.out.println("Now status of first thread  " + obj.isAlive());
		JoinMethodEx jme = new JoinMethodEx();
		jme.start();

	}

}
