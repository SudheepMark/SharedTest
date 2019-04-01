package ObjaectsAndClasses;

public class Computer {
private final String model;
private final Processors processor;
private HardDrive harddrive;
private Memory memory;
private double price;

public Computer(String model, Processors processor, HardDrive harddrive, Memory memory) {
	
	this.model = model;
	this.processor = processor;
	this.harddrive = harddrive;
	this.memory = memory;
}


public HardDrive getHarddrive() {
	return harddrive;
}


public void setHarddrive(HardDrive harddrive) {
	this.harddrive = harddrive;
}


public Memory getMemory() {
	return memory;
}


public void setMemory(Memory memory) {
	this.memory = memory;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public String getModel() {
	return model;
}


public Processors getProcessor() {
	return processor;
}


public void turnOn(){
	System.out.println();
}

public void displayOnScreen(){
	System.out.println();
}

public void recieveMouseInput(String input){
	System.out.println();
}

public void recieveKeyboardInput(String input){
	System.out.println();
}


}
