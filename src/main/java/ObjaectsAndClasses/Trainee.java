package ObjaectsAndClasses;

public class Trainee {

	// attributes 
	// private variables cannot be accessed outside the class
	private static int numberOfTrainees;
	private int id;
	private String name;
	private String stream;
	private int week;
	
	//constructor
	public Trainee(String name, String stream){
		this.name = name;
		this.stream = stream;
		this.week = 1;
		numberOfTrainees++;
		id = numberOfTrainees;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		if(week>0){
			this.week = week;
		}else {
		this.week = 1;
		}
	}

	// behaviours (methods)
	public void learn(){
		System.out.println(name+" is learning "+stream);
	}
	
	public int takeExam(String exam){
	//	System.out.println(name+" is taking the "+stream+" exam.");
		return (int) (Math.random()*100);
	}

	public static int getNumberOfTrainees() {
		return numberOfTrainees;
	}

	public int getId() {
		return id;
	}

	

	
	
	
}
