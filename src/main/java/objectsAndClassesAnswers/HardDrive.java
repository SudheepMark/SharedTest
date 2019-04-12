package objectsAndClassesAnswers;

public class HardDrive {

	private String model;
	private double gigaBytesCapacity;
	private double gigaBytesUsed;

	public void writeData(String data, String file) {
		System.out.println("writing "+data+" to "+file);
	}
	
	public String readData(String file) {
		return "data from "+file;
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

	public double getGigaBytesUsed() {
		return gigaBytesUsed;
	}

	public void setGigaBytesUsed(double gigaBytesUsed) {
		this.gigaBytesUsed = gigaBytesUsed;
	}
	
}
