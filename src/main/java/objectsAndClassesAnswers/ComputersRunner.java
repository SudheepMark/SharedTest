package objectsAndClassesAnswers;

import java.util.List;

public class ComputersRunner {

	public static void main(String[] args) {
		
		HardDrive drive1 = new HardDrive();
		HardDrive drive2 = new HardDrive();
		
		Memory memory1 = new Memory();
		Memory memory2 = new Memory();
		
		Processor processor1 = new Processor();
		Processor processor2 = new Processor();
		
		drive1.setModel("Seagate");
		drive1.setGigaBytesUsed(0);
		drive1.setGigaBytesCapacity(2048);
		
		drive2.setModel("Dell");
		drive2.setGigaBytesUsed(500);
		drive2.setGigaBytesCapacity(3072);
		
		memory1.setModel("Kingston");
		memory1.setSpeed(1600);
		memory1.setGigaBytesCapacity(4);
		
		memory2.setModel("Corsair");
		memory2.setSpeed(1333);
		memory2.setGigaBytesCapacity(8);
		
		processor1.setModel("Intex Xeon");
		processor1.setNumberOfCores(6);
		processor1.setSpeed(2.93);
		
		processor2.setModel("Intex Xeon");
		processor2.setNumberOfCores(6);
		processor2.setSpeed(2.93);
		
		Computer computer1 = new Computer("Dell",processor1,drive1,memory1);
		Computer computer2 = new Computer("HP",processor2,drive2,memory2);
		
		computer1.setPrice(399);
		computer2.setPrice(299);
		
		ComputerShop computerShop = new ComputerShop("ABC Computers","Cottons centre, London");
		
		computerShop.addComputer(computer1);
		computerShop.addComputer(computer2);
		
		// check both Dell and HP are in the computer shop
		List<Computer> computers = computerShop.getAllComputers();
		
		System.out.println("computers in shop:");
		
		for (Computer computer : computers) {
			System.out.println(computer.getMODEL());
		}
		
		computerShop.removeComputer("HP");
		
		// check only Dell is in the computer shop after HP removed
		computers = computerShop.getAllComputers();
		
		System.out.println("\ncomputers left in shop after remove:");
		
		for (Computer computer : computers) {
			System.out.println(computer.getMODEL());
		}
		
		
	}

}
