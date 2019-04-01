package ObjaectsAndClasses;

import java.util.ArrayList;

public class ComputerShop {
	private String name;
	private String address;
	private ArrayList<Computer> computers= new ArrayList <Computer>();
	
	public ComputerShop(String name, String address) {
		
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void addComputer(Computer computer) {
		this.computers.add(computer);
	}
	
	public ArrayList<Computer> getAllComputers() {
		return computers;
	}
	
	public void removeComputer(String model) {
		for(int i=0; i<computers.size(); i++){
			if(model.equals(computers.get(i).getModel()))
			{
				this.computers.remove(computers.get(i));
			}
		}
		
	}
	
	

}
