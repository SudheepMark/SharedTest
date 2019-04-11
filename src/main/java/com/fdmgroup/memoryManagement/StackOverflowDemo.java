package com.fdmgroup.memoryManagement;

public class StackOverflowDemo {

	public static void main(String[] args) {
		recurse(1);

	}

	public static void recurse(int x) {
		System.out.println(x);
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		recurse(x + 1);
	}
}
