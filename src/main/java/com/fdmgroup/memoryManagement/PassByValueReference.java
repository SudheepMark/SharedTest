package com.fdmgroup.memoryManagement;

public class PassByValueReference {

	public static void main(String[] args) {

		int x=5;
		int y=3;
		System.out.println("before swap x is "+x+" and y is "+y);
		swap(x,y);
		System.out.println("after swap x is "+x+" and y is "+y);
		

	}

	public static void swap(int x, int y){
		int temp =x;
		x=y;
		y=temp;
		
	}
}
