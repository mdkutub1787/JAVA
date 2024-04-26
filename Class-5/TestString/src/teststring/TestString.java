package teststring;

import java.util.Scanner;

/**
 * @author MD KUTUB UDDIN
 */
public class TestString {

    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//        System.out.println("Please Enter Your Email or Phone Number");
//        String userName = s.next();
//        System.out.println("Please enter Your Password");
//        String password = s.next();
//        String message = String.format("Wellcome to %s Facebook", userName);
//        if (userName.equalsIgnoreCase("mdkutubuddin") && password.equals("Kutub1787")) {
//            System.out.println(message);
//
//        } else {
//
//            System.out.println("Could't Fined Your Facebook Account ");
//
//        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Googl Account : ");
        String userName = s.next();
        String message = String.format("Wellcome to %s Google", userName);

        if (userName.equalsIgnoreCase("kutub1787")) {
            System.out.println("Enter Your Password");
            String password = s.next();
            if (password.equals("Kutub1787")) {
                System.out.println(message);
            } else {
                System.out.println("Incorrect Password");
            }
        } else {
            System.out.println("Couldn't find Your Google Account");
        }

    }
}


