package com.LeaningJava;
class counter{
    int count;
    public synchronized void increment(){
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
//but even if we had started the new thread now but
        //when we have a shared variable and we increment
        // 2 times then increment happens only once..
        //ex: count++ => count=count+1;
        //because both the thread reaches the variable at
        //same time
        //in that case if we want that only one thread approaches
        //shared variables at a time.
//what is join? main started the threads and without
        //waiting for threads to complete it just executes
        //next statement of printing the count
        // in between jitta bhi increment ho paya
        //usse main ko mtlb nhi..
        //so we use a join method which shows that wait until
        //threads complete the execution and joins back the
        //main method
t1.join();
t2.join();

//joins plus synchronize is equal to constant output

        System.out.println(c.count);
    }
}
