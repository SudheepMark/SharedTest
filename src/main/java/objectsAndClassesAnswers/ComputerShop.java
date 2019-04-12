package objectsAndClassesAnswers;

import java.util.ArrayList;
import java.util.List;

public class ComputerShop {

	private String name;
	private String address;
	private List<Computer> computers = new ArrayList<Computer>();
	
	public ComputerShop(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public void addComputer(Computer computer) {
		computers.add(computer);
	}
	
	public void removeComputer(String model) {
		for(int index = 0; index < computers.size(); index++) {
			Computer computer = computers.get(index);
			
			if (computer.getMODEL().equals(model)) {
				computers.remove(index);
			}
			
		}
	}
	
	public List<Computer> getAllComputers(){
		return computers;
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
	
	
}
