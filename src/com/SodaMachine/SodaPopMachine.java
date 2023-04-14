package com.SodaMachine;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Scanner;

public class SodaPopMachine {
    private ArrayList<Sodas> sodas;
    private double money;
    // Constructor to initialize variables
    public SodaPopMachine(ArrayList<Sodas> sodas, double money) {
        this.sodas = sodas;
        this.money = money;
    }



    // Method to display available sodas
    public void displaySodas() {
        System.out.println("Available sodas:");
        for (Sodas soda : sodas) {
            soda.displaySoda();
        }
    }

    // Method to buy soda
    public void userBuyingSoda(String option) {
        Scanner scanner = new Scanner(System.in);

        // Loop to continue buying soda until the user wants to exit
        while (!option.equals("exit")) {
            // If option is 1, buy soda
            if (option.equals("1")) {
                System.out.println("Welcome to the soda vending machine.");
                displaySodas();
                System.out.println("Enter the number of the soda you want to buy:");
                int sodaNumber = scanner.nextInt();
                // Checking if entered soda number is valid
                if (sodaNumber < 1 || sodaNumber > sodas.size()) {
                    System.out.println("Invalid soda number. Please enter a number between 1 and " + sodas.size() + ".");
                    continue;
                }
                Sodas selectedSoda = sodas.get(sodaNumber - 1);
                // Checking if selected soda is in stock
                if (selectedSoda.getAmount() > 0) {
                    System.out.println("You selected " + selectedSoda.getName() + ".");
                    System.out.println("The price is $" + selectedSoda.getPrice() + ".");
                    System.out.println("How many would you like to buy?");
                    int quantity = scanner.nextInt();
                    // Checking if entered quantity is valid
                    if (quantity <= 0 || quantity > selectedSoda.getAmount()) {
                        System.out.println("Invalid quantity. Please enter a quantity between 1 and " + selectedSoda.getAmount() + ".");
                        continue;
                    }
                    // Calculating cost of the selected soda
                    double cost = selectedSoda.getPrice() * quantity;
                    System.out.println("The total cost is $" + cost + ".");
                    System.out.println("Please enter your payment (maximum $10):");
                    double payment = scanner.nextDouble();
                    // Checking if entered payment is valid
                    while (payment <= 0 || payment > 10) {
                        System.out.println("Invalid amount. Please enter a payment between 0 and 10:");
                        payment = scanner.nextDouble();
                    }
                    // Calculating total payment
                    while (payment < cost) {
                        System.out.println("Not enough money. Please enter additional payment:");
                        double additionalPayment = scanner.nextDouble();
                        while (additionalPayment <= 0 || additionalPayment > 10) {
                            System.out.println("Invalid amount. Please enter a payment between 0 and 10:");
                            additionalPayment = scanner.nextDouble();
                        }
                        payment += additionalPayment;
                    }
                    // Calculating and displaying change
                    double change = payment - cost;
                    System.out.println("Thank you for your purchase!");
                    selectedSoda.setAmount(selectedSoda.getAmount() - quantity);
                    money += cost;
                    System.out.println("Your change is $" + change);
                } else {
                    System.out.println("\nSorry, " + selectedSoda.getName() + " is out of stock.");
                }
            }
            // If option is 0, exit the program
            else if (option.equals("0")) {
                System.out.println("Come back when you are thirsty!");
                System.exit(0);
            } else {
                System.out.println("Invalid option. Please enter 1 to buy a soda, or 0 to exit.");
            }
            System.out.println("Would you like to purchase another soda? Enter 1 for yes, 0 for no.");
            option = scanner.next();
        }
    }
    
    // It first creates an ArrayList of sodas and adds four types of sodas to it.
    // The program then creates a new SodaPopMachine object with the ArrayList of sodas and a balance of 0.
    public static void main(String[] args) {
        ArrayList<Sodas> sodas = new ArrayList<>();
        sodas.add(new Sodas("Coca-Cola", "1.", 1.50, 10));
        sodas.add(new Sodas("Pepsi", "2.", 1.25, 5));
        sodas.add(new Sodas("Sprite", "3.", 1.25, 7));
        sodas.add(new Sodas("Fanta", "4.", 1.25, 3));
        SodaPopMachine machine = new SodaPopMachine(sodas, 50);

        // The program then prompts the user to either buy a soda or exit the program.
        // If the user chooses to buy a soda, it calls the userBuyingSoda method of the SodaPopMachine object.
        Scanner scanner = new Scanner(System.in);
        String option = "";
        while (!option.equals("exit")) {
            System.out.println("Welcome to the soda vending machine. Enter 1 to buy a soda, 0 to exit.");
            option = scanner.next();
            machine.userBuyingSoda(option);
        }
        scanner.close();
    }
}