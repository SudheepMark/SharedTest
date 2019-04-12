package objectsAndClassesAnswers;

public class Passenger {

	private String name;
	private boolean travelPass;
	private double money;
	
	public Passenger(String name, boolean travelPass, double money) {
		this.name = name;
		this.travelPass = travelPass;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean hasTravelPass() {
		return travelPass;
	}
	public void setTravelPass(boolean travelPass) {
		this.travelPass = travelPass;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
}
