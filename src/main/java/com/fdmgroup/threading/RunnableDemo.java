package com.fdmgroup.threading;

public class RunnableDemo implements Runnable {
	private String name;

	public RunnableDemo(String name) {
		super();
		this.name = name;
	}

	public void run() {
		System.out.println("starting " + name);
		for (int number = 1; number <= 100; number++) {
			System.out.println(name + ": " + number);
			if(number%5 ==0){
				System.out.println(name+" yielding");
				Thread.yield();
			}
		/*	try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}*/

		}

		System.out.println("ending " + name);
	}

}
