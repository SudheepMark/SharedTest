package com.fdmgroup.threading;

public class ThreadDemo extends Thread {
	private String name;

	public ThreadDemo(String name) {
		super();
		this.name = name;
	}

	public void run() {
		System.out.println("starting " + name);
		for (int number = 1; number <= 100; number++) {
			System.out.println(name + ": " + number);
			try {
				sleep(1);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

		}

		System.out.println("ending " + name);
	}
}
