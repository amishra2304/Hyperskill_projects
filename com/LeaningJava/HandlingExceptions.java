package com.LeaningJava;

public class HandlingExceptions {
    public static void main(String[] args){
        //there are different types of exceptions
        //Arithmetic exception
        //Array out of bound exception and many more
        //we can create our own customised exception for something.
        int a=1;
        int b=0;
        int c;
       // c=a/b;//now this line will throw an arithmetic exception
        // so we'll write it in try catch block
        //if we don't know which expression we can just write catch(Exception e) that is inclusive
        //of all the exceptions.
        try
        {
            c=a/b;
            System.out.println("This statement will only execute if " +
                            "above statements doesn't have any exception"
                    );
        }
        catch(ArithmeticException nameofobjectofarithmeticexception)
        {
            System.out.println("its an arithmetic error" + " " +nameofobjectofarithmeticexception);
        }

    }
}
