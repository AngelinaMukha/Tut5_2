package com.company;

public class OrderMaker {
    public void margarita(PizzaMaker maker){
        maker.setPizzaName("Margarita");
        maker.setSize("medium");
        maker.setWithSouse(false);
    }
    public void hawai(PizzaMaker maker){
        maker.setPizzaName("Hawai");
        maker.setSize("big");
        maker.setWithSouse(true);
        maker.setSouse("White Pizza Sauce");
    }
    public void fourSeasons(PizzaMaker maker){
        maker.setPizzaName("Four seasons");
        maker.setSize("small");
        maker.setWithSouse(false);
    }

}
