package com.techelevator.ui;

import com.techelevator.models.Item;

import java.math.BigDecimal;
import java.util.Map;


/**
 * Responsibilities: This class should handle formatting and displaying ALL
 * messages to the user
 * 
 * Dependencies: None
 */
public class UserOutput
{

    public static void displayMessage(String message)
    {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    public static void displayHomeScreen()
    {
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                      Home");
        System.out.println("***************************************************");
        System.out.println();
    }

    public static void displaySlots(Map<String, Item> inventory){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                      MENU");
        System.out.println("***************************************************");
        System.out.println();
        for (Map.Entry<String, Item> slotName : inventory.entrySet()) {
            //A1: U-Chews (Gum)  Price: $1.65
            System.out.println(slotName.getValue().getSlot() + ": " + slotName.getValue().getName() + " (" + slotName.getValue().getType() + "), Price: $" + slotName.getValue().getPrice());
        }


    }


}
