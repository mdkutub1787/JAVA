package testset;

import java.util.LinkedList;

/**
 * @author MD KUTUB UDDIN
 */
public class TestSet {

    public static void main(String[] args) {
        
    LinkedList <Student> list=new LinkedList<Student>();
       Student s1=new Student("Raju", "Nine", 101);
       Student s2=new Student("Sana", "Ten", 102);
       Student s3=new Student("Kutub", "Eleven", 103);
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        for (Student s : list) {
            System.out.println(s.id+" " + s.name+ " "+s.className);
        }

//        LinkedList<String> link = new LinkedList<>();
//        link.add("Bangladesh");
//        link.add("Nepal");
//        link.add("Uganda");
//        link.add("Bangladesh");
//        System.out.println(link);
//
//        link.addFirst("Japan");
//        link.addLast("Brazil");
//        System.out.println(link);
//        System.out.println("Size : " + link.size());
//
//        link.removeLast();
//        link.removeFirst();
//        System.out.println(link.getFirst());
//        System.out.println(link);
//        System.out.println(link.getLast());
//        System.out.println("Size : " + link.size());
//        
//     
//        
//        for (String string : link) {
//            System.out.println(string);
//        }
    }

}
