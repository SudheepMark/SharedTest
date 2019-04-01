package ObjaectsAndClasses;

public class Trainer {
	
	//final means variable is constant
	private final int id;
	private String name;
	private int yearsOfExperience;
	
	public Trainer(int id, String name, int yearsOfExperience) {
		this.id = id;
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
	}

	
	public void teach(){
		System.out.println(name+" is teaching");
		
	}

	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

}
