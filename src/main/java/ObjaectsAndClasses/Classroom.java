package ObjaectsAndClasses;

import java.util.ArrayList;

public class Classroom {

	private final String name;
	private final int capacity;
	private String course;
	private Trainer trainer;
	//initialised with empty arraylist of trainees
	private ArrayList <Trainee> trainees = new ArrayList<Trainee>();
	
	public Classroom(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public ArrayList<Trainee> getTrainees() {
		return trainees;
	}

	public void addTrainee(Trainee trainee){
		trainees.add(trainee);
	}
	
	public void removeTrainee(Trainee trainee){
		trainees.remove(trainee);
	}


	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}
	
	
	
}
