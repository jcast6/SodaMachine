package com.SodaMachine;

public class Sodas {
    private String name;
    private String number;
    private double price;
    private int amount;

    public Sodas(String name, String number, double price, int amount) {
        this.name = name;
        this.number = number;
        this.price = price;
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void displaySoda() {
        System.out.println(number + name + " - Price: $" + price + " - Amount: " + amount);
    }
}

