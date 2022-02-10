package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VendingMachineCLI {

	public VendingMachineCLI() {

	}
	private Scanner userInput = new Scanner(System.in);
	private String[][] inventory = new String[16][4];

	public static void main(String[] args) {

		VendingMachineCLI cli = new VendingMachineCLI();
		// import inventory file and set up items
		cli.run();

	}

	public void run() {

		String[][] inventory = loadInventory();
		displayWelcomeMessage();
		mainMenuUI();

		// ToDo - Add Code here to show menu, etc.
		userInput.close();
	}

	public void displayWelcomeMessage() {
		System.out.println("*************************************************************");
		System.out.println("*  Welcome to our vending machine application.");
		System.out.println("*************************************************************");
		System.out.println("");
	}

	public void mainMenuUI() {


		boolean isValidChoice = false;
		while (!isValidChoice) {
			System.out.println("1. Display Items");
			System.out.println("2. Purchase Items");
			System.out.println("3. Exit");
			System.out.println("Please enter a choice: ");
			String userChoice = userInput.nextLine();
			switch (userChoice) {
				case "1":
					displayInventory();
					System.out.println("choice 1");
					//isValidChoice = true;
					break;
				case "2":
					subMenu();
					System.out.println("choice 2");
					//isValidChoice = true;
					break;
				case "3":
					// exit program
					System.out.println("choice 3");
					isValidChoice = true;
					break;
				case "4":
					// generate sale report
					System.out.println("*** generate sales report");
					//isValidChoice = true;
					break;
				default:
					System.out.println("Not a valid entry");
					break;
			}
		}

	}

	public void subMenu() {
		boolean isValidChoice = false;
		while (!isValidChoice) {
			System.out.println("1. Feed Money");
			System.out.println("2. Select Product");
			System.out.println("3. Finish Transaction");

			String userChoice = userInput.nextLine();
			switch (userChoice) {
				case "1":
					// call Feed Money
					System.out.println("choice sub.1");
					//isValidChoice = true;
					break;
				case "2":
					// display sub menu
					System.out.println("choice sub.2");
					//isValidChoice = true;
					break;
				case "3":
					// exit program
					System.out.println("choice sub.3");
					isValidChoice = true;
					break;

				default:
					System.out.println("Not a valid entry");
					break;
			}
		}
		}
	public String[][] loadInventory(){
		File fileToRead= new File("VendingMachine.txt");
		//String[][] inventory = new String[16][4];
		try(Scanner inventoryFile = new Scanner(fileToRead)){
			int rowCounter = 0;
			while (inventoryFile.hasNextLine()) {
				String lineOfText = inventoryFile.nextLine();
				String[] itemLine = lineOfText.split("\\|");
				for (int i = 0; i < itemLine.length; i++) {
					inventory[rowCounter][i] = itemLine[i];
				}
				rowCounter++;
			}
		}catch(FileNotFoundException exception){
			System.out.println("File not found");
		}
		return inventory;
	}

	public void displayInventory(){
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 16; j++) {
				System.out.println(inventory[j][i]);
			}
			
		}
		//System.out.println(inventory);
	}

}
