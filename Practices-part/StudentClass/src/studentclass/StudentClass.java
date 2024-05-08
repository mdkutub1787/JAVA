package studentclass;

import java.util.Arrays;

/**
 * @author MD KUTUB UDDIN
 */
public class StudentClass {

    public static void main(String[] args) {
        //object declare
        Student s = new Student();
        //assaing value
        s.name = "Md Kutub Uddin";
        s.age = 23;
        s.height = 5.3f;
        s.weight = 50.5f;
        s.country = "Bangladesh";
        //print statement
        System.out.println("My Name is " + s.name);
        System.out.println("Age is " + s.age);
        System.out.println("Height is " + s.height);
        System.out.println("Weight is " + s.weight);
        System.out.println("Country is " + s.country);
    }
}

//class make
class Student {

    //datatype and variable declare
    String name = "Abid";
    int age;
    float height;
    float weight;
    String country;
}
