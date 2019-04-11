package com.fdmgroup.generics;

//T is a placeholder for datatype
//extend limits the datatypes that can go into T
public class GenericDemo <T extends Number, V>{
	
	private T x;
	private V y;

	public T getX() {
		return x; 
	}

	public void setX(T x) {
		this.x = x;
	}

	public V getY() {
		return y;
	}

	public void setY(V y) {
		this.y = y;
	}
	
	

}
