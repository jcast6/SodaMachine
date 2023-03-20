package com.SodaMachine;

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
            System.out.println("Enjoy your soda!");
            numCans--;
            amountBought++;
            money += 1.5;
        } else {
            System.out.println("Sorry, no more soda cans available.");
        }
    }

    public void refill(int numCansToAdd) {
        numCans += numCansToAdd;
        System.out.println("Machine refilled with " + numCansToAdd + " soda cans.");
    }

    public void getPrice() {
        System.out.println("Price: " + canCost);
    }

    public void setCanCost(double canCost) {
        this.canCost = canCost;
    }

    public void setAmountBought(int amountBought) {

        this.amountBought = amountBought;
    }

    public void getAmountBought() {
        System.out.println("You purchased " + amountBought + " sodas.");
    }

    public void displayStatus() {
        System.out.println("Number of soda cans: " + numCans);
        System.out.println("Amount of money in machine: $" + money);
        System.out.println("Price per soda: " + canCost);
    }

    public static void main(String[] args) {
        SodaPopMachine machine = new SodaPopMachine(10, 15.0, 1.5);
        machine.displayStatus();
        machine.buySoda();
        machine.buySoda();

        //Refill the sodas
        machine.refill(3);
        machine.refill(5);

        //Buy soda and display soda machine properties
        machine.buySoda();
        machine.displayStatus();


    }

}