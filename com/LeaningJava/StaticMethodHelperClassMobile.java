package com.LeaningJava;

public class StaticMethodHelperClassMobile {
    //we are trying to make a mobile class that will have name brand and price
    static String name;
    //making name var static;
    int price;
    String brand;

    public void print(){
        System.out.println(name +": "+ price +": " +brand);
        return ;
    }
}
