package genericearray;

import java.util.ArrayList;

/**
 * @author MD KUTUB UDDIN
 */
class ArrayList2 {

    public static void main(String[] args) {

        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        //Adding elements
        number1.add(20);
        number1.add(40);
        number1.add(90);
        number1.add(80);
        number1.add(23);
        System.out.println("Number 1 : " + number1);

        number2.add(70);
        number2.add(40);
        number2.add(10);
        number2.add(80);
        number2.add(53);
        System.out.println("Number 2 : " + number2);

        number3.addAll(number1);
        System.out.println("Number 3 : " + number3);

        
        //equal check
        boolean result=number1.equals(number2);
        System.out.println("Number1== number2 :" + result);
        
        
        boolean Result1=number1.equals(number3);
        System.out.println("Number1== number2 :" + Result1);
        
        
    }
}
