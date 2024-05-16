package map;

import java.util.HashSet;

/**
 * @author MD KUTUB UDDIN
 */
public class TestHashSet {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Jamal");
        set.add("Kamal");
        set.add("Samir");
        System.out.println("Size : " + set.size());
        System.out.println(set);

        set.remove("Samir");
        System.out.println(set);
        
        boolean value=set.isEmpty();
        System.out.println(value);
    }

}
