package com.techelevator.ui;

import com.techelevator.models.Item;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 * 
 * Dependencies: None
 */
public class UserInput
{
    private static Scanner scanner = new Scanner(System.in);
    private static BigDecimal userMoney = new BigDecimal("0.00");

    public static String getHomeScreenOption()
    {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Vending Machine Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        if (option.equals("D"))
        {
            return "display";
        }
        else if (option.equals("P"))
        {
            return "purchase";
        }
        else if (option.equals("E"))
        {
            return "exit";
        }
        else
        {
            return "";
        }

    }

    public static void purchase(Map<String, Item> inventory){
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("I) Insert money");
        System.out.println("S) Select item");
        System.out.println("F) Finish transaction");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        if (option.equals("I"))
        {
            insert();
        }
        else if (option.equals("S"))
        {
            UserInput.select(inventory);
        }
        else if (option.equals("F"))
        {
            // return "finish";
        }
        else
        {
            // return "";
        }
    }

    public static void insert() {
        String option = "";
        while (option != "E"){
            System.out.println("Insert bill here ($1, $5, $10, $20 only), or press E and exit to menu");
            UserOutput.displayBills();
            option = scanner.nextLine();
            if (option.equals("1")) {
                userMoney = userMoney.add(new BigDecimal("1.00"));
                System.out.println("You have inserted a $1 bill. Your total is now $" + userMoney);
            }
           else if (option.equals("5")) {
                userMoney = userMoney.add(new BigDecimal("5.00"));
                System.out.println("You have inserted a $5 bill. Your total is now $" + userMoney);
            }
            else if (option.equals("10")) {
                userMoney = userMoney.add(new BigDecimal("10.00"));
                System.out.println("You have inserted a $10 bill. Your total is now $" + userMoney);
            }
           else if (option.equals("20")) {
                userMoney = userMoney.add(new BigDecimal("20.00"));
                System.out.println("You have inserted a $20 bill. Your total is now $" + userMoney);
            }
            else if (option.equalsIgnoreCase("E")){
                break;
            }
            else {
                System.out.println("Invalid entry, please try again");
            }
        }
    }

    public static void select(Map<String, Item> inventory) {
        System.out.println("Please enter the slot identifier of the item you would like: ");
        String slotNumber = scanner.nextLine();
        if (inventory.containsKey(slotNumber)) {
            if (userMoney.compareTo(inventory.get(slotNumber).getPrice()) >= 0) {
                inventory.get(slotNumber).vend();
                System.out.println("Vending" + inventory.get(slotNumber).getName());
                userMoney = userMoney.subtract(inventory.get(slotNumber).getPrice());
                System.out.println("You have $" + userMoney + " remaining");
            }
            else {
                System.out.println("You do not have enough funds for that selection. Please insert more money.");
            }
        }
        else {
            System.out.println("No item found, please try again.");
        }
    }

    
}
