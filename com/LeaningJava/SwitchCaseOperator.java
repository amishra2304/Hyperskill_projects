package com.LeaningJava;

public class SwitchCaseOperator {
    // before java 5 only int was allowed in switches
    //but then after strings were also;
//the tradition way for switchcase
//    public static void main(String[] args){
//        String day="saturday";
//
//        switch (day){
//            case "Monday":System.out.println("4:00am");
//            break;
//            case "Tuesday":System.out.println("4:15am");
//            break;
//
//            default:
//                System.out.println("3:55am");
//        }
//    }
//}
//In case you are fedup with break statement and
//you want that switch should return a value then that's also possible in newwr version

    public static void main(String[] args){
        String day="Saturday";
        String result="";

        result=switch(day){
            case "Monday"->"4am";
            case "Tuesday"->"4:15";
            default->"3:55am";
        };
        System.out.println(result);


    }

}
