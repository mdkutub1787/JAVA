package javaconversation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author MD KUTUB UDDIN
 */
public class JavaConversation {

    public static void main(String[] args) throws ParseException {

//        String to int convert
//        String s = "200";
//        int i = Integer.parseInt(s);
//
//        System.out.println(s + 200);
//        System.out.println(i + 200);
//                int convert to String
//    int i=500;
//    String s=String.valueOf(i);
//    
//        System.out.println(i+500);
//        System.out.println(s+500);
//String to long convert
//        String s = "500";
//       long l =Long.parseLong(s);
//       
//       System.out.println(s+200);
//       System.out.println(l+200);
//  long to String convert
//        long l = 500;
//       String s=String.valueOf(l);
//       
//       System.out.println(s+200);
//       System.out.println(l+200);
//    String to  float 
//        String s = "400";
//        float f = Float.parseFloat(s);
//
//        System.out.println(s + 600);
//        System.out.println(f + 600);

//       float to String
//        float f = 40.5f;
//        String s =String.valueOf(f);
//
//        System.out.println(f + 500);
//        System.out.println(s + 500);


//        String to double
//
//      String s="500";
//      double d=Double.parseDouble(s);
//      
//
//        System.out.println(s + 500);
//        System.out.println(d + 500);
        
//         Double to String

//      double d=500.545;
//      String s=String.valueOf(d);
//      
//
//        System.out.println(s + 500);
//        System.out.println(d + 500);

//        String to date

//     String s= "27/04/2024 5:56:57";
//     Date d=new SimpleDateFormat("dd/mm/yyyy hh:mm:s").parse(s);
//     
//
//       System.out.println(d);   
//       System.out.println(s);   
       
//Date to string

//Calendar d=Calendar.getInstance();
//DateFormat dateFormat=new SimpleDateFormat("dd/mm/yyyy hh:mm:s");
//        String s=dateFormat.format(d);
//
//
//        System.out.println(s);


   
        // Date string
        String dateString = "2024-04-27";

        // Define the date format
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Parse the date string
        try {
            Date date = dateFormat.parse(dateString);
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            System.err.println("Error parsing date: " + e.getMessage());
        }
   

    }
   
}
