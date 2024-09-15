package com.tie.practical_testing.unit.beverage;

public class Latte implements Beverage {

    @Override
    public String getName() {
        return "라뗴";
    }

    @Override
    public int getPrice() {
        return 4500;
    }

}