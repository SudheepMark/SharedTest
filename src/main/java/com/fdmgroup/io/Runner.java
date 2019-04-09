package com.fdmgroup.io;

public class Runner {

	public static void main(String[] args) {
		String line = "this is a line of text";
		String file = "H:\\xxxxxxxxxxxxxxxxxxxx.txt";
		FileIO fileIO = new FileIO();
		fileIO.writeLine(line, file);
		//System.out.println(fileIO.readFile(file));
		System.out.println(fileIO.countCharacter(file, 'e'));
	//	fileIO.addUser();
	//	fileIO.addUser();
		fileIO.displayUser("H:\\yyyyyyyyyyyyyyyyyyy.txt");

	}

}
