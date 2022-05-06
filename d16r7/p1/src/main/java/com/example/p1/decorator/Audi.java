package com.example.p1.decorator;

public class Audi implements ICar{

    private int price;
    public Audi(int price){
        this.price = price;
    }


    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void showPrice() {
        System.out.println("audi's price is : "+this.price);
    }
}
