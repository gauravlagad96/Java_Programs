package com.thread;

class Table {

	synchronized void showTable(int x) {
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.printf("%d x %d = %d\n", i * i * x);
//				Thread.sleep(3000);
			}
		} catch (Exception ex) {
			System.out.println("Error is" + ex);
		}
	}

}

class Two extends Thread {
	Table table;

	void setTable(Table table) {
		this.table = table;
	}

	public void run() {
		table.showTable(2);
	}

}

class Three extends Thread {
	Table table;

	void setTable(Table table) {
		this.table = table;
	}

	public void run() {
		table.showTable(3);
	}
}

public class SynchronizedApp {

	public static void main(String[] args) {
		

	}
}
