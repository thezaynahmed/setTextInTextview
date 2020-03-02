package com.example.zain;

public class Microphone {
    // Instance Variables / Properties / Fields
   private String name;
   private String color;
   private int model;

   public Microphone(){}
   public Microphone(String name, String color){
       this.name = name;
       this.color = color;
   }
   public Microphone(String name, String  color, int model){
        this.name = name;
        this.color = color;
        this.model = model;
    }
    public Microphone(String name, int model){
       this.name = name;
       this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public void color(String color){
//        this.color = color;
//    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }


    //Actions / Behaviours / Methods
    public void turnOff(){
        System.out.println(this.name + " Turn Off");
    }
    public void turnOn(){
        System.out.println(this.name + " Turn On");
    }
    public void setVolume(){
        System.out.println(this.name + " Setting Volume");
    }

    public String showDescription(){
        return  "Microphone Name " + this.name +  " with color " + this.color
                + " and it's model " + this.model;
    }
}