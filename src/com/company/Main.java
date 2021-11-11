package com.company;

public class Main {

    public static void main(String[] args) {
        OrderMaker orderMaker = new OrderMaker();

        PizzaMaker cook = new PizzaMaker();
        orderMaker.margarita(cook);

        Pizza pizza = cook.getResult();
        System.out.println("Pizza cooked:\n" + pizza.getName()+" "+pizza.getSize());
    }
}
