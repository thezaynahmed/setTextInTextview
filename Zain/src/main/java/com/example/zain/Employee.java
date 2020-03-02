package com.example.zain;

public class Employee extends Person{

    private int id;
    private double annualSalary;


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public double getannualSalary() {
        return annualSalary;
    }

    public void setannualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

//    @Override
//    public String toString() {
//        return this.getFirstName() + ", "
//                + this.getLastName() + ", "
//                + this.getannualSalary() + ", "
//                + this.getId() + ", " + this.getAge();
//    }
}
