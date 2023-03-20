package com.SodaMachine;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class SodaPopMachine {
    private int numCans;
    private double canCost;
    private double money;
    private int amountBought;

    public SodaPopMachine(int numCans, double money, double canCost) {
        this.numCans = numCans;
        this.money = money;
        this.canCost = canCost;
    }

    public void buySoda() {
        if (numCans > 0) {
            System.out.println("\nEnjoy your soda!");
            numCans--;
            amountBought++;
            money += 1.5;
        } else {
            System.out.println("\nSorry, no more soda cans available.");
        }
    }

    public void refill(int numCansToAdd) {
        numCans += numCansToAdd;
        System.out.println("\nMachine refilled with " + numCansToAdd + " soda cans.");
    }

    public void getPrice() {
        System.out.println("\nPrice: " + canCost);
    }

    public void setCanCost(double canCost) {
        this.canCost = canCost;
    }

    public void setAmountBought(int amountBought) {

        this.amountBought = amountBought;
    }

    public void getAmountBought() {
        System.out.println("\nYou purchased " + amountBought + " sodas.");
    }

    public void displayStatus() {
        System.out.println("Number of soda cans: " + numCans);
        System.out.println("Amount of money in machine: $" + money);
        System.out.println("Price per soda: " + canCost);
    }

    public void userBuyingSoda(int option) {
        while(option != 0 && option != 1) {
            System.out.println("Enter a valid option.");
            Scanner newOption = new Scanner(System.in);
            option = newOption.nextInt();
        }
        if(option == 1) {
            System.out.println("Welcome to the soda vending machine.");
            displayStatus();
        }
        else if (option == 0) {
            System.out.println("Come back when you are thirsty!");
        }

    }
/*
    public static void main(String[] args) {
        SodaPopMachine machine = new SodaPopMachine(10, 15.0, 1.5);
        machine.displayStatus();
        machine.buySoda();
        machine.buySoda();

        //Refill the sodas
        machine.refill(3);
        machine.refill(5);


        // Show the amount of sodas bought
        machine.getAmountBought();

        //Buy soda and display soda machine properties
        machine.buySoda();
        machine.getAmountBought();
        machine.displayStatus();

    }
}

 */

     // Here we are trying to make the vending machine be used by user input

    public static void main(String[] args) {
        SodaPopMachine machine = new SodaPopMachine(10, 15.0, 1.5);
        Scanner userDecision = new Scanner(System.in);
        System.out.println("Would you like to purchase a soda?");
        int userOption = userDecision.nextInt();
        machine.userBuyingSoda(userOption);

    }

}