package com.fdmgroup.threading;

public class RunnerThread {

	public static void main(String[] args) {
		System.out.println("starting main method");
		ThreadDemo td1 = new ThreadDemo("thread1");
		ThreadDemo td2 = new ThreadDemo("thread2");
		
		td1.start();
		td2.start();
		
		System.out.println("ending main method");
	}

}
