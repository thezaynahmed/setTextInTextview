package com.example.zain;
import java.awt.datatransfer.SystemFlavorMap;
import java.sql.SQLOutput;
import java.util.Arrays;
import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class MyClass {
    public static void main(String[] args) {
//        loop();
//        anotherMethod("hi",10);
//        integer(8);
//        addNumbers(12, 12);
//        multiplyNumbers(22,52);
//        double result = divideNumbers(5, 4) * (5 + 5);
//        result += 1;
//        result = result + 1;
//        System.out.println(result);
//
//
//
//        System.out.println(divideNumbers(5, 4) * 5);

//        minusNumbers(5,8);
//          total();
//        String name = fullName("Zain","Ahmed");
//        char s = showChar('b');
//        System.out.println(name + " " + s);
//        names();
        String bio = showBio("zain","i am zain ahmed", 15);
        System.out.println(bio);

        //Control Flow - Introduction
        //if Statments

        // -- Relational Operatore 👇👇 --
        // = -->  Assignment
        // == -> Comparison
        // != Not
        // > Greater Than
        // < Less Than
        // => Greater Than Or Equal
        // <= Less Than Or Equal


        // -- Logical Operatore 👇👇 --
        // AND --> && Returns False IF One Is False
        // OR || Returns True If The One Side Is True
        // ! Negation

//        boolean isAged = true;
//        boolean isNotAged = false;
//        double legalAge = 21;
//        double illegalAge =17;

//        if(isAged && isNotAged){
//            System.out.println("Qualified");
//        }else
//        {
//            System.out.println("Not Qualified");
//        }
//        if((isAged || isNotAged) && (legalAge > illegalAge)){
//            System.out.println("Qualified");
//        }else
//        {
//            System.out.println("Not Qualified");
//        }

/*
        double a = 12;
        double b = 6;
        boolean isAged = true;

        if (a != b){
            System.out.println("Indeed! بے شک ");
        }else {
            System.out.println("Not True");
        }

        //! Negation
        if (!isAged){
            System.out.println("Indeed! بے شک ");
        }else {
            System.out.println("Not True");
        }

        int a = 15;
        int b = 15;
        int total = a * b;
        System.out.println("The Total Is " + total);

        double c = 15;
        double d = 7;

        double remainder = c%d; // divide 15 by 6 and see if there's a remainder.
        System.out.println(remainder);

        //Remainder % == "What Remains...."

         //Variables  == bucket in memory
        //An Empty String is indeed a string
        String zain = "zain";
        String emoji = "😊";
        char a = 'a';
        int age = 10;
        int age2 = 20;
        long sum = age + age2;
        long weightOfPlanat = 1000000000;

//        Int 32 bits
//        Long 64 bits
//        1.2, 5.5 2.6, 0.2 Decimal Numbers
//        Float - 32 bit (7 digits)
//        Double - 64 bit (15-16 digits)
//        Decimal - 128 bit (28-29 significant digits)

        float pi = 3.75f;
        double pid = 5.24; //bigger with more precision
        byte b = 127; //127 max in byte
        short s = 254; //2x bigger than byte
        //Boolean = True Or False, 1 , 0

        boolean isTrue = true;
//        boolean isTrue;
//        isTrue = true;

        System.out.println("Name " + zain + " Age " + age + " " + sum);
        System.out.println(pi +" "+ pid + " " + a + isTrue);
        System.out.println(b + s);

//        System.err.println("error message");

        */
    }

    public static void total(){
        addNumbers(12, 12);
        multiplyNumbers(5,2);
        divideNumbers(5, 4);
        minusNumbers(5,8);
    }

    public static void addNumbers(int a, int b){
        int sum = a + b;
        System.out.println("Add Sum is " + sum);
        // System.out.println("Sum is" + " " + (a + b));
    }
    public static void multiplyNumbers(int a, int b){

        System.out.println("Multiply Sum " + (a * b));

    }

    public static double divideNumbers(double a, int b){

//        System.out.println("Divide Sum " + (a / b));
        return (a / b);

    }
    public static void minusNumbers(int a, int b)
    {
        int sum = a - b ;
        System.out.println("Minus Sum " + sum);
    }

//    public static String fullName(String firstName, String lastName){
//        System.out.println("zain");
//        return firstName + lastName;
//    }



    public static void loop(){
        for (int i = 0; i < 25; i++){
            //Will Run This Code Here
            if(i % 2 == 0){
                System.out.println(i + " Remainder Of 2");
            }
        }
        System.out.println("From ShowName");

    }
    public static void anotherMethod(String something, int age){
        if(age < 90){
            System.out.println("Still Young");
        }
    }
    public static void integer(int num){
        System.out.println("integer " + num);
    }

    public static String fullName(String firstName, String lastName){
        return firstName+ " " + lastName;
    }
    public static char showChar(char c){
        return c;
    }
    public static void names(){
        String namesArr[] = {"zain", "ahmed"};
        System.out.println(namesArr[0] + " " + namesArr[1]);
        System.out.println(Arrays.toString(namesArr));
    }

    public static String showBio(String name, String bio, int age){
        return "My name is " + name + " and I am "
                + age + " years old. "+ bio;
    }

}
