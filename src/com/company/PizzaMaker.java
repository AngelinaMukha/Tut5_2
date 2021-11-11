package com.company;

public class PizzaMaker implements Cook{
    private String name;
    private boolean withSouse;
    private String souse;
    private String size;


    @Override
    public void setPizzaName(String name) {
        this.name=name;
    }

    @Override
    public void setWithSouse(boolean souse) {
        this.withSouse=souse;
    }

    @Override
    public void setSouse(String souse) {
        this.souse=souse;
    }

    @Override
    public void setSize(String size) {
        this.size=size;
    }

    public Pizza getResult() {
        return new Pizza(name, withSouse, size);
    }
}
