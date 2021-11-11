package com.company;

public class Pizza {
    private final String name;
    private final boolean withSouse;
    private String souse;
    private final String size;
    public Pizza(String name, boolean withSouse, String size){
        this.name=name;
        this.withSouse=withSouse;
        this.size=size;
    }
    public void setSouse(String souse){
        if(this.withSouse){
            this.souse=souse;
        }
    }
    public String getName(){
        return this.name;
    }
    public boolean getWithSouse(){
        return this.withSouse;
    }
    public String getSize(){
        return this.size;
    }

}
