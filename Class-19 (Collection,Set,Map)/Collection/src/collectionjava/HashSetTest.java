package collectionjava;

import java.util.HashSet;
import java.util.Set;

/**
 * @author MD KUTUB UDDIN
 */
class HashSetTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Bangladesh");
        set.add("India");
        set.add("Nepal");
        set.add("Pakistan");
        set.add("Afghan");
        set.add("Afghan");
        System.out.println(set);

    }
}
