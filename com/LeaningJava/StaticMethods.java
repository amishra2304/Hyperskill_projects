package com.LeaningJava;

public class StaticMethods {
    public static void main(String[] args){
//        t6_help_mobile obj1= new t6_help_mobile();
//        obj1.name="phone";
//        obj1.price=1200;
//        obj1.brand="Apple";
//        obj1.print();
//        t6_help_mobile obj2= new t6_help_mobile();
//        obj2.name="phone";
//        obj2.price=1500;
//        obj2.brand="Samsung";
//        obj2.print();
        //the above was the ordinary way of doing things but what if we make name variable static?
//               t6_help_mobile obj1= new t6_help_mobile();
//        obj1.name="phone";
//        obj1.price=1200;
//        obj1.brand="Apple";
//
//
//        obj1.print();
//        t6_help_mobile obj2= new t6_help_mobile();
//        obj2.name="phone";
//        obj2.price=1500;
//        obj2.brand="Samsung";
//        obj2.print();
//
//        System.out.println("After changing the static variable\n");
//
//        obj1.name="smartphone";
//        obj1.print();
//        obj2.print();
        //changing static variable for one object means that it is changed for both
        //because static variable are stored separately although in heap only but  not inside the  actual objects...
        //and objects have references to the static variable;

        // normally accessing the static variable will give warning and hence static variable must be accessed by
        // its class name;
        //the proper calling method
        StaticMethodHelperClassMobile obj1= new StaticMethodHelperClassMobile();
        StaticMethodHelperClassMobile.name="phone";
        obj1.price=1200;
        obj1.brand="Apple";


        obj1.print();
        StaticMethodHelperClassMobile obj2= new StaticMethodHelperClassMobile();
        StaticMethodHelperClassMobile.name="phone";
        obj2.price=1500;
        obj2.brand="Samsung";
        obj2.print();

        System.out.println("After changing the static variable\n");

        StaticMethodHelperClassMobile.name="smartphone";
        obj1.print();
        obj2.print();


    }
}
