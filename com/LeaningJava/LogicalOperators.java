package com.LeaningJava;

public class LogicalOperators {
    public static void main(String[] args){
        int a=6;
        int b=6;
        int c=5;
        int d=6;
        boolean res1= (a==b)&(c==d);
        boolean res2=(a==b)|(c==d);//short circuit  if one is true then other one isn't even checked

        // note one more  thing that print statements in java dosen't returns something so print(print..)) will
        // give error;
        System.out.println(res1);
        System.out.println(res2);
    }
}
