package com.LeaningJava;

import java.util.Scanner;

public class CustomExceptionHandling {
    //the customised exception handling class should be an extended version of
    // some pre-existing  exception class

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //doubt why it's giving an error if i declare a and then use scan.nextInt()
        int a = scan.nextInt();
        int b = scan.nextInt();
        // int c=a/b;
        //let's say we have this and we don't want c to be zero
        int c = 0;
        try {
            c = a / b;
            if (c == 0)
                //now c=0 don't throw an exception but we have coded it so that it'll throw an
                // exception and catch block will catch that exception
                throw new ZeroValueException("This cannot be zero");

        } catch (ZeroValueException e) {
            System.out.println(e);
        }
        try {
            Class.forName("Calc");
        }
        catch(ClassNotFoundException e){
            System.out.println("The class is not found");
        }
    }

}
