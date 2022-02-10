package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inventory {

    private Item[] inventoryB;
    
    
    public void loadInventory(){
        File fileToRead= new File("VendingMachine.txt");
        //String[][] inventory = new String[16][4];
        try(Scanner inventoryFile = new Scanner(fileToRead)){
            int counter = 0;
            while (inventoryFile.hasNextLine()) {
                String lineOfText = inventoryFile.nextLine();
                String[] itemLine = lineOfText.split("\\|");
                
              //


                switch (itemLine[3]){
                    case "Chip":
                        inventoryB[counter]= new Chips(itemLine[0],itemLine[1], itemLine[2]);
                        break;
                    case "Candy":
                        inventoryB[counter]=new Candy(itemLine [0],itemLine[1], itemLine [2]);
                        break;
                    case "Drink":
                        inventoryB[counter]=new Drinks(itemLine [0],itemLine[1], itemLine [2]);
                        break;
                    case "Gum":
                        inventoryB[counter]=new Gum(itemLine [0],itemLine[1], itemLine [2]);
                        break;

                    default:
                        break;

                }
                counter++;
            }
        }catch(FileNotFoundException exception){
            System.out.println("File not found");
        }
        //return inventory;
    }
    public void displayInventory() {
        for (int i = 0; i < 4; i++) {
            System.out.println(inventoryB[i]);

                //TODO display inventory
            }

        }
    }


