package com.exercise2;

public class car {
    String model;
    int year;

    public  static void main(String [] args){
        car myCar= new car();
        myCar.model="Corolla";
        myCar.year=2024;

        System.out.println("Model : "+ myCar.model);
        System.out.println("İl : "+myCar.year);


    }
}

