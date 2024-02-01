package com.LeaningJava;
//There's an inbuilt class thread we just extended that class
//it provides the functionality to create threads in java
// the compulsory thing is ki we need to declare our method using run and call it using start
//here we gave a timer of 10 milli to show that our processes are executing simultaneously, if we won't give
//delay then it will print everything so fast that we can't realise the context switching and time sharing
//feature of threads
class A extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("Hi");
            try{
                A.sleep(10);
            }catch(Exception e){
                System.out.println("Error");
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            System.out.println("Hello");
            try{
                B.sleep(10);
            }catch(Exception e){
                System.out.println("Error");
            }

        }
    }

}
public class Threading {
    public static void main(String[] args){
        A obj1= new A();
        B obj2=new B();
        obj2.start();
        obj1.start();
    }
}
