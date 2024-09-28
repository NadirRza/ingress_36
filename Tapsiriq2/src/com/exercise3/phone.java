package com.exercise3;

import java.util.Arrays;

public class phone {
    String brand;
    String model;
    double price;

    public static void main(String[] args) {
        phone myPhone = new phone();
        myPhone.brand = "Samsung";
        myPhone.model = "Galaxy S21";
        myPhone.price = 799.99;
        System.out.println("Brand: "+myPhone.brand);
        System.out.println("Model: "+myPhone.model);
        System.out.println("Price: "+myPhone.price);

        myPhone.price=659.9;
        System.out.println("New price : "+myPhone.price);
    }
}
