package com.company;

public class Sedan extends Vehicle {
    private double price;
    private String color;
    private int id;

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Sedan(String brand, int age, String type, int price, String color, int id) {
        super(brand, age, type);
        this.price = price;
        this.color = color;
        this.id = id;
    }

    public double calcFinalPrice(double tax){
        return this.price * tax;
    }

}
