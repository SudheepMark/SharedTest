package com.fdmgroup.threading;

public class RunnerRunnable {

	public static void main(String[] args) {
		RunnableDemo rd1 = new RunnableDemo("thread1");
		RunnableDemo rd2 = new RunnableDemo("thread2");
		RunnableDemo rd3 = new RunnableDemo("thread3");

		Thread thread1 = new Thread(rd1);
		Thread thread2 = new Thread(rd2);
		Thread thread3 = new Thread(rd3);
		
		thread1.start();
		thread2.start();
		
	
	//	thread3.start();
	}

}
