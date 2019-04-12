package ObjaectsAndClasses;

public class TrainerRunner {

	public static void main(String[] args) {

		// Create objects of classes
		Trainee trainee1 = new Trainee("Wil", "Java");
		Trainee trainee2 = new Trainee("Michael", "Java");

		// set attributes
		// trainee1.setName("Wil");
		// trainee1.setStream("Java");
		trainee1.setWeek(-5);

		// System.out.println(trainee1.getName()+" is in week
		// "+trainee1.getWeek());

		// trainee2.setName("Michael");
		// trainee2.setStream("Java");
		trainee2.setWeek(5);

		// System.out.println(trainee2.getName()+" is in week
		// "+trainee2.getWeek());

		// call methods
		trainee1.learn();
		trainee2.learn();

		int trainee1Results = trainee1.takeExam("ood week 2");
		int trainee2Results = trainee2.takeExam("ood week 2");

		// System.out.println(trainee1.getName()+" has scored
		// "+trainee1Results);
		// System.out.println(trainee2.getName()+" has scored
		// "+trainee2Results);

		Classroom classroom1 = new Classroom("Codd", 12);

		Trainer trainer = new Trainer(1, "Nick", 10);

		classroom1.setTrainer(trainer);
		classroom1.setCourse("Java");

	}

}
