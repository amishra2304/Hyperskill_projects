package com.LeaningJava;
class counter{
    int count;
    public void increment(){
        count++;
    }
}
public class RaceAndSync {
    public static void main(String[] args) throws InterruptedException {
        //we here, instead of creating a extended class, we can directly write a lambda function
        //using runnable class because ultimately thread class also inherits that only
        counter c= new counter();
Runnable obj1=() ->{
    for(int i=1;i<1000;i++){
        c.increment();
    }
        };
Runnable obj2= () ->{
    for(int i=1;i<1000;i++){
c.increment();
    }
};
Thread t1=new Thread(obj1);
Thread t2=new Thread(obj2);
t1.start();
t2.start();
//the join statement finally joins the both thread thus
        //making sure tha
t1.join();
t2.join();
        System.out.println(c.count);
    }
}
