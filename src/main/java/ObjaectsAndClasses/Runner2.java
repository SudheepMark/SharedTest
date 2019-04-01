package ObjaectsAndClasses;

public class Runner2 {

	public static void main(String[] args) {
		HardDrive drive1 = new HardDrive();
		HardDrive drive2 = new HardDrive();
		Processors processor1 = new Processors();
		Processors processor2 = new Processors();
		Memory memory1 = new Memory();
		Memory memory2 = new Memory();
		Computer computer1 = new Computer("Dell", processor1, drive1, memory1);
		Computer computer2 = new Computer("HP", processor2, drive2, memory2);

		drive1.setModel("Seagate");
		drive1.setGigaBytesCapacity(2048);
		drive1.setGigaBytesUsed(0);
		drive2.setModel("Dell");
		drive2.setGigaBytesCapacity(3072);
		drive2.setGigaBytesUsed(500);

		System.out.println(drive1.getModel() + " has a capacity of " + drive1.getGigaBytesCapacity()
				+ " GB and has used " + drive1.getGigaBytesUsed() + " GB");
		System.out.println(drive2.getModel() + " has a capacity of " + drive2.getGigaBytesCapacity()
				+ " GB and has used " + drive2.getGigaBytesUsed() + " GB");

		processor1.setModel("Intel Xeon");
		processor1.setNumberOfCores(6);
		processor1.setSpeed(2.93);
		processor2.setModel("Intel Celeron");
		processor2.setNumberOfCores(2);
		processor2.setSpeed(2.9);
		System.out.println(processor1.getModel() + " has " + processor1.getNumberOfCores()
				+ " cores and has a speed of " + processor1.getSpeed() + " Mhz");
		System.out.println(processor2.getModel() + " has " + processor2.getNumberOfCores()
				+ " cores and has a speed of " + processor2.getSpeed() + " Mhz");

		memory1.setModel("Kingston");
		memory1.setGigaBytesCapacity(4);
		memory1.setSpeed(1600);
		memory2.setModel("Corsair");
		memory2.setGigaBytesCapacity(8);
		memory2.setSpeed(1333);
		System.out.println(memory1.getModel() + " has a capacity of " + memory1.getGigaBytesCapacity()
				+ " GB and has a speed of " + memory1.getSpeed() + " Mhz");
		System.out.println(memory2.getModel() + " has a capacity of " + memory2.getGigaBytesCapacity()
				+ " GB and has a speed of " + memory2.getSpeed() + " Mhz");

		computer1.setPrice(399);
		computer2.setPrice(299);

		ComputerShop computershop = new ComputerShop("ABC", "yxz");
		computershop.addComputer(computer1);
		computershop.addComputer(computer2);

		for (int count = 0; count < computershop.getAllComputers().size(); count++) {
			System.out.println(computershop.getAllComputers().get(count).getModel());
		}

		computershop.removeComputer("Dell");
		for (int count = 0; count < computershop.getAllComputers().size(); count++) {
			System.out.println(computershop.getAllComputers().get(count).getModel());
		}

	}

}
