package calculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        //Scanner scan=new Scanner(System.in);
        int bub= 202;
        int tof=118;

        int ic=2250;
        int mil=1680;
        int dou=1075;
        int pa=80;

        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $" +bub);
        System.out.println("Toffee: $" +tof);
        System.out.println("Ice Cream: $" +ic);
        System.out.println("Milk Chocolate: $" +mil);
        System.out.println("Doughnut: $" +dou);
        System.out.println("Pancake: $" +pa);
        System.out.println();
        //int res=bub+tof+ic+mil+dou+pa;
        Income obj=new Income();
        int res=obj.income(bub,tof,ic,mil,dou,pa);
        System.out.println("Income: $" +res);
        Scanner scan =new Scanner(System.in);
        System.out.println("Staff expenses:");
        int staff=scan.nextInt();
        System.out.println("Other expenses:");
        int other=scan.nextInt();
        Otherexpense obj1=new Otherexpense();
        int net=obj1.net_inc(res,staff,other);
        System.out.println("Net income: $" +net);
    }
}