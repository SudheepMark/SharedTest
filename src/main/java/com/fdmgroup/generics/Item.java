package com.fdmgroup.generics;

public abstract class Item <T extends Number>{
private T ID;

public Item(T iD) {
	ID = iD;
}

public T getID() {
	return ID; 
}

public void setID(T iD) {
	ID = iD;
}

}
