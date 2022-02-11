package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Machine {

    private List<Item> inventory = new ArrayList<>();
    private File inputFile;
    // inputFile is empty bucket that can take in any file put in and use it to load the inventory.
    private BigDecimal balance = new BigDecimal("0.00");

    public Machine(File inputFile) {
        this.inputFile = inputFile;
        inventory = loadInventory();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    private List<Item> loadInventory() {
        //File fileToRead= new File(inputFile);
        try (Scanner inventoryFile = new Scanner(inputFile)) {
            int counter = 0;
            while (inventoryFile.hasNextLine()) {
                String lineOfText = inventoryFile.nextLine();
                String[] itemLine = lineOfText.split("\\|");
                switch (itemLine[3]) {
                    case "Chip":
                        inventory.add(new Chips(itemLine[0], itemLine[1], itemLine[2]));
                        break;
                    case "Candy":
                        inventory.add(new Candy(itemLine[0], itemLine[1], itemLine[2]));
                        break;
                    case "Drink":
                        inventory.add(new Drinks(itemLine[0], itemLine[1], itemLine[2]));
                        break;
                    case "Gum":
                        inventory.add(new Gum(itemLine[0], itemLine[1], itemLine[2]));
                        break;
                    default:
                        break;
                }
                counter++;
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
        }
        return inventory;
    }

    public void displayInventory() {
        for (Item unit : inventory) {
            System.out.println(unit);
        }

    }

    public BigDecimal depositMoney(BigDecimal amountToDeposit) {
        balance = balance.add(amountToDeposit);
        return balance;
    }

    public void selectProduct(){

    }
}


