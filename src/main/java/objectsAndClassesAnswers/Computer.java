package objectsAndClassesAnswers;

public class Computer {

	private final String MODEL;
	private final Processor PROCESSOR;
	private HardDrive hardDrive;
	private Memory memory;
	private double price;


	public Computer(String mODEL, Processor pROCESSOR, HardDrive hardDrive, Memory memory) {
		super();
		MODEL = mODEL;
		PROCESSOR = pROCESSOR;
		this.hardDrive = hardDrive;
		this.memory = memory;
	}
	
	public void turnOn(){
		System.out.println("computer is turning on");
	}
	
	public void turnOff(){
		System.out.println("computer is turning off");
	}
	
	public void receiveMouseInput(String input) {
		System.out.println("receiving input from mouse");
	}

	public void receiveKeyboardInput(String input) {
		System.out.println("receiving input from keyboard");
	}
	
	public HardDrive getHardDrive() {
		return hardDrive;
	}
	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
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
	public String getMODEL() {
		return MODEL;
	}
	public Processor getPROCESSOR() {
		return PROCESSOR;
	}
	
}
