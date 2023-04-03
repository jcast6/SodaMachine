package com.SodaMachine;

import java.util.Scanner;

public class SodaPopMachine {

    // Private instance variables are used to encapsulate data
    private int numCans;
    private double canCost;
    private double money;
    private int amountBought;

    // Constructor initializes the instance variables
    public SodaPopMachine(int numCans, double money, double canCost) {
        this.numCans = numCans;
        this.money = money;
        this.canCost = canCost;
    }
/*
    // This method simulates a customer buying a soda from the machine
    public void buySoda() {
        if (numCans > 1) {
            System.out.println("\nEnjoy your soda!");
            numCans--;
            amountBought++;
            money += 1.5;
        } else {
            System.out.println("\nSorry, no more soda cans available.");
        }
    }


 */
    // This method adds cans to the machine
    public void refill(int numCansToAdd) {
        numCans += numCansToAdd;
        System.out.println("\nMachine refilled with " + numCansToAdd + " soda cans.");
    }

    // This method displays the price of a soda
    public void getPrice() {
        System.out.println("\nPrice: " + canCost);
    }

    // This method sets the price of a soda
    public void setCanCost(double canCost) {
        this.canCost = canCost;
    }

    // This method sets the amount of sodas bought by the customer
    public void setAmountBought(int amountBought) {

        this.amountBought = amountBought;
    }

    // This method displays the amount of sodas bought by the customer
    public void getAmountBought() {
        System.out.println("\nYou purchased " + amountBought + " sodas.");
    }

    // This method displays the status of the vending machine
    public void displayStatus() {
        System.out.println("Number of soda cans: " + numCans);
        System.out.println("Amount of money in machine: $" + money);
        System.out.println("Price per soda: " + canCost);
    }

    // This method simulates a customer buying a soda from the machine
    // It takes an integer option as input, which represents the customer's choice
    public void userBuyingSoda(String option) {
        while(!option.equals("exit")) {
            if(option.equals("1")) {
                System.out.println("Welcome to the soda vending machine.");
                displayStatus();
                System.out.println("Enter the number of sodas you want to buy:");
                Scanner scanner = new Scanner(System.in);
                int numSodasToBuy = scanner.nextInt();
                if (numSodasToBuy <= numCans) {
                    System.out.println("Thank you for your purchase!");
                    numCans -= numSodasToBuy;
                    amountBought += numSodasToBuy;
                    money += numSodasToBuy * canCost;
                    if (numSodasToBuy > 1) {
                        System.out.println("\nEnjoy your drinks!");
                        System.out.println("Would you like to purchase another drink. Enter 1 yes, 0 for no");
                    } else {
                        System.out.println("\nEnjoy your drink!");
                        System.out.println("Would you like to purchase another drink.");
                    }
                } else {
                    System.out.println("\nSorry, there are not enough sodas in the machine. Enter 1 yes, 0 for no");
                }
            } else if (option.equals("0")) {
                System.out.println("Come back when you are thirsty!");
            } else {
                System.out.println("Enter a valid option or type 'exit' to quit.");
            }
            Scanner newOption = new Scanner(System.in);
            option = newOption.nextLine();
        }
    }

    public static void main(String[] args) {
        SodaPopMachine machine = new SodaPopMachine(10, 15.0, 1.5);
        Scanner userDecision = new Scanner(System.in);
        System.out.println("Would you like to purchase a soda? Enter 1 for yes and 0 for no.");
        String userOption = userDecision.next();
        machine.userBuyingSoda(userOption);



    }

}