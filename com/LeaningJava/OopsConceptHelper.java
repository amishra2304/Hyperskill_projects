package com.LeaningJava;

public class OopsConceptHelper {
    int num=4;
//suppose if i write something like num=4 then this num is instance variable
    //the instance variables goes into heap section

    public int add(int number1,int number2){
        System.out.println("added");
        return number1+number2;//here a and b are local variables
    }
}
