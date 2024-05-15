package genericearray;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author MD KUTUB UDDIN
 */
public class GenericeArray {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Inetial Size = " + number.size());

        //Adding Elements
        number.add(10);
        number.add(20);
        number.add(40);
        number.add(50);

//        for (int i: number) {
//            System.out.print(i+ " ");
//        }
        Iterator i = number.iterator();
        while (i.hasNext()) {
            System.out.print(" " + i.next());
        }
        System.out.println(number);
        System.out.println();
        System.out.println("After Adding Size = " + number.size());

        //Removing Array elements
//        number.remove(2);
//        System.out.println("After Remove : " + number);
//        
//        number.removeAll(number);
//        System.out.println("After Remove : " + number);


//        number.clear();
//        System.out.println("After Remove : " + number);

//        
//        //Array Empty check
        boolean check=number.isEmpty();
        System.out.println("ArrayList Empty : "+check);
        
       // ArrayList Element check
        boolean containt=number.contains(10);
        System.out.println("10 is in the list :" + containt);
        
        //Position elements
        int pos= number.indexOf(40);
        System.out.println("30 index of : " + pos);
        
        //Set Array
        number.set(3,60 );
        System.out.println("After seting " +number);
        
        //Get Array 
        int get =number.get(1);
        System.out.println("index of 1 :" + get);
        
        
        
    }
}