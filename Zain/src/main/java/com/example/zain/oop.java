package com.example.zain;

import java.util.ArrayList;

public class oop {
    public static void main(String[] args) {

        //Array Lists
      //  ArrayList name = new ArrayList<>();
        ArrayList name = new ArrayList();
        name.add("zain");
        name.add("huzaifa");
        name.add("burhan");
     //   System.out.println(name.get(3));

        for (int i = 0; i < name.size(); i++){
            System.out.println("Names " + name.get(i));
        }
        //Cleaver For Loop
        for (Object names : name){
            System.out.println("Names : " + names);
        }


       ArrayList arrayList = new ArrayList();
        arrayList.add("hi");
        arrayList.add("zain");

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println("Names " + arrayList.get(i));
        }

//        int[] myArray = {1,43,95,88,45,58,85}; // length = 6
//        String[] names = {"zain","huzaifa","burhan"};
//
//        int[] myArray = {14,29,38,41,25,10,54,25,46,85};
//        String[] sArrayy = {"a","b","c","d","e"};
//        int zain[] = {1,5,2,5,8,5,8,5,8,5,8,85};
//
//        for(int i = 0; i < myArray.length; i++){
//
//            System.out.println("Nums : " + myArray[i]);
//
//        }

//
//        int[] newArray = new int[100];
//        String[] newNames = new String[100];
//
//        newArray[0] = 12;
//        newArray[1] = 14;
//        newArray[2] = 16;
//        newArray[3] = 18;
//        newArray[4] = 18;
//\

//        for (int i = 0; i < newArray.length; i++){
//            System.out.println("Number : " + newArray[]);
//        }


//        for (int i = 0; i < newArray.length; i++){
//            System.out.println(newArray[i] + "  Length  " +newArray.length + "  " + i);
//        }
//        for (int i = 0; i < myArray.length; i++){
//            System.out.println("Items : " + myArray[i]);
//        }
//
//        for (int i = 0; i < names.length; i++){
//            System.out.println("Names : " + names[i]);
//        }
//
//        System.out.println(myArray[2]);
//        System.out.println(names[0]);

//        Employee employee = new Employee();
//        employee.setFirstName("Employee");
//        employee.setLastName("Elast");
//        employee.setAge(25);
//        employee.setId(155464);
//        employee.setannualSalary(100000);

        //System.out.println(employee.getannualSalary());
//        System.out.println(employee.getClass());
//
//        Manager manager = new Manager();
//        manager.setFirstName("Zain");
//        manager.setLastName("Ahmed");
//        manager.setAge(15);
//        manager.setId(156);
//        manager.setannualSalary(500000);
//
//        System.out.println(manager);
//        System.out.println(manager.toString());

//        String z = "h";
//        boolean e = z.isEmpty();
//        boolean c = z.contains("h");
//
//        if(c){
//            System.out.println("Contains");
//        }else {
//            System.out.println("Empty");
//        }


//
//        System.out.println("Name : " + manager.getFirstName()
//                + " " + manager.getLastName() + " Id : "
//                + manager.getId() + " Annual Salary : "
//                + manager.getannualSalary());

//        Microphone microphone = new Microphone("zain","white",10); //Instantiating Our Object
//        Microphone mic = new Microphone("mic",45);
//        mic.setName("name");
//        mic.setColor("Yellow");
//        System.out.println("Mic Color "+ mic.getName() +"  " + mic.getColor() +" \n " + mic.showDescription());
////        microphone.color = "blue";
////        microphone.name = "yeti";
////        microphone.model = 15;
//        microphone.setModel(45);
//        microphone.setName("zain");
//        microphone.setColor("Red And Black");
//
////        microphone.color("Blue");
//        System.out.println(microphone.getName() + " New Mic " + microphone.getModel() + " " + microphone.getColor());
//
//        Microphone newMic = new Microphone("New Mic","Green", 50);
//        Microphone otherMic = new Microphone();
//        otherMic.setColor("bluuuuuuuuuuuuuuuuuuu");
//        System.out.println(otherMic.getColor());
//        Microphone grandMic = new Microphone("Grand","Yellow");
//
       // Microphone mic = new Microphone("ghz","red",56);
//        mic.model = 56;
//        mic.name = "ghz";
//        mic.color = "red";
       // System.out.println(microphone.color.toUpperCase());
       // System.out.println(mic.name.toUpperCase());

        //Microphone samsung = new Microphone("ghz","red",56);
//        samsung.name = "s1";
//        samsung.color = "black";
//        samsung.model = 2;
        //System.out.println(samsung.name);



       // Microphone sony = new Microphone("ghz","red",56);
//        sony.name = "v1";
//        sony.color = "gray";
//        sony.model = 3;
      //  System.out.println(sony.name);
//
//        microphone.turnOn();
//        microphone.setVolume();
//        microphone.turnOff();

//        System.out.println(microphone.showDescription());
//
//        System.out.println(sony.showDescription());

//        sony.turnOn();
//        sony.setVolume();
//        sony.turnOff();


        //  Person zain = new Person();
//        Person zain = new Person("Zain","Ahmed",15);
////        System.out.println("Name : "+ zain.getFirstName() + " "+ zain.getLastName() +"\nAge : " +zain.getAge());
    }
}
