package objectsAndClassesAnswers;

public class Memory {

	private String model;
	private double gigaBytesCapacity;
	private double speed;
	
	
	public void storeData(String data) {
		System.out.println("storing "+data);
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getGigaBytesCapacity() {
		return gigaBytesCapacity;
	}
	public void setGigaBytesCapacity(double gigaBytesCapacity) {
		this.gigaBytesCapacity = gigaBytesCapacity;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
	
	
	
}
