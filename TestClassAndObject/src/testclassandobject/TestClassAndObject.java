package testclassandobject;

import geomatry.Circle;
import math.MaxMin;
import math.MaxMinChange;
import math.PrimeNumber;

public class TestClassAndObject {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        MaxMin maxMin=new MaxMin();
        
        System.out.println(MaxMinChange.NUMBER1+10);
        
        

        
        maxMin.number1=20;
        maxMin.number2=30;
        maxMin.number3=10;
        
        
        MaxMin m=new MaxMin(50, 90, 20);

           
//        System.out.println(maxMin.number1);
        
        
        System.out.println(maxMin.findMaxNumber());
        System.out.println(maxMin.findMinNumber());
        
        System.out.println(m.findMaxNumber());
        System.out.println(m.findMinNumber());
        

        // String message = pn.checkPrimeNumber();
        
        
//        boolean message=pn.checkPrimeNumber();

//        if(message){
//            System.out.println("Its prime number");
//        }
//        else{
//                    System.out.println("Its prime number");
//
//        }
//        System.out.println(message);
//
//        //circle.setRadious(3);
//        System.out.println(circle.getArea());
//        System.out.println(circle.getPerimeter());

    }

}