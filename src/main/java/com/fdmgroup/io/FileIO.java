package com.fdmgroup.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

	public void writeLine(String line, String file) {
		FileWriter filewriter = null;
		BufferedWriter bufferedwriter = null;
		try {
			filewriter = new FileWriter(file, true); // appends to file or
														// creates if not
														// existing
			bufferedwriter = new BufferedWriter(filewriter);
			bufferedwriter.write(line);
			bufferedwriter.newLine();
			System.out.println("line written to file");

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				bufferedwriter.close();
				filewriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	public String readFile(String file) {

		String currentLine = null;
		StringBuilder allLines = new StringBuilder();
		FileReader filereader = null;
		BufferedReader bufferedreader = null;

		try {
			filereader = new FileReader(file);
			bufferedreader = new BufferedReader(filereader);

			while ((currentLine = bufferedreader.readLine()) != null) {
				allLines.append(currentLine + "\n");
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				filereader.close();
				bufferedreader.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

		return allLines.toString();

	}

	public int countCharacter(String file, char character) {

		String currentLine = null;
		StringBuilder allLines = new StringBuilder();
		FileReader filereader = null;
		BufferedReader bufferedreader = null;
		int numberOfCharacter = 0;

		try {
			filereader = new FileReader(file);
			bufferedreader = new BufferedReader(filereader);

			while ((currentLine = bufferedreader.readLine()) != null) {
				for (int count = 0; count < currentLine.length(); count++) {
					if (currentLine.charAt(count) == character) {
						numberOfCharacter++;
					}
					// allLines.append(currentLine+"\n");
				}
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				filereader.close();
				bufferedreader.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

		return numberOfCharacter;

	}

	public void addUser() {

		String file = "H:\\yyyyyyyyyyyyyyyyyyy.txt";
		FileWriter filewriter = null;
		BufferedWriter bufferedwriter = null;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Username");
		String name = scanner.nextLine();

		System.out.println("Enter the Password");
		String pass = scanner.nextLine();

		System.out.println("Enter the email");
		String mail = scanner.nextLine();
		scanner.close();
		try {
			filewriter = new FileWriter(file, true); // appends to file or
														// creates if not
														// existing
			bufferedwriter = new BufferedWriter(filewriter);
			bufferedwriter.write(name + "," + pass + "," + mail);
			bufferedwriter.newLine();
			System.out.println("line written to file");

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				bufferedwriter.close();
				filewriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

	public void displayUser(String file) {

		String currentLine = null;
		StringBuilder allLines = new StringBuilder();
		FileReader filereader = null;
		BufferedReader bufferedreader = null;
		ArrayList<User> users = new ArrayList<User>();
		User user;

		try {
			filereader = new FileReader(file);
			bufferedreader = new BufferedReader(filereader);

			while ((currentLine = bufferedreader.readLine()) != null) {
				String[] temp = currentLine.split(",");
				user = new User(temp[0], temp[1], temp[2]);
				users.add(user);
			}
			for (User user1 : users) {
				System.out.println(user1.getUsername() + " has a password - " + user1.getPassword() + " and an email - "
						+ user1.getEmail());
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				filereader.close();
				bufferedreader.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}
}
