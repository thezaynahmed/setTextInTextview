package com.example.zain;

public class Manager extends Employee {

    @Override
    public double getannualSalary() {
        return super.getannualSalary() + 1000;
    }

    @Override
    public int getId() {
        return super.getId() + 100;
    }

    @Override
    public String toString() {
        return this.getFirstName() + ", "
                + this.getId() + ", "
                + getannualSalary();
    }
}
