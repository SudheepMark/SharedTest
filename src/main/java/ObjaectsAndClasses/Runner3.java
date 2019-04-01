package ObjaectsAndClasses;

public class Runner3 {

	public static void main(String[] args) {

		Trainee trainee1 = new Trainee("Wil", "Java");
		Trainee trainee2 = new Trainee("Michael", "Java");
		Trainee trainee3 = new Trainee("Dom", "Java");
		Trainee trainee4 = new Trainee("Sudheep", "Java");
		Trainee trainee5 = new Trainee("Jose", "Java");
		
		System.out.println(+trainee1.getId()+" "+trainee1.getName());
		System.out.println(+trainee2.getId()+" "+trainee2.getName());
		System.out.println(+trainee3.getId()+" "+trainee3.getName());
		System.out.println(+trainee4.getId()+" "+trainee4.getName());
		System.out.println(+trainee5.getId()+" "+trainee5.getName());
		System.out.println("Number of Trainees is "+Trainee.getNumberOfTrainees());
		
	}

}
