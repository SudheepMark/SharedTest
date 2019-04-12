package objectsAndClassesAnswers;

public class Processor {

	private String model;
	private int numberOfCores;
	private double speed;
	
	public void processData(String data) {
		System.out.println("processing "+data);
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumberOfCores() {
		return numberOfCores;
	}
	public void setNumberOfCores(int numberOfCores) {
		this.numberOfCores = numberOfCores;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
}
