package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VendingMachineCLI {

	public VendingMachineCLI() {

	}

	private Scanner userInput = new Scanner(System.in);
	public Inventory inventory= new Inventory();

	public static void main(String[] args) {

		VendingMachineCLI cli = new VendingMachineCLI();
		// import inventory file and set up items
		cli.run();

	}

	public void run() {
		inventory.loadInventory();

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
					inventory.displayInventory();
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

		//System.out.println(inventory);
	}

}
