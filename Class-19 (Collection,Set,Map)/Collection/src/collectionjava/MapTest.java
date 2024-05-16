package collectionjava;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MD KUTUB UDDIN
 */
public class MapTest {

    public static void main(String[] args) {

        Map<String, Student> map = new HashMap<>();
        map.put("sobuj", new Student("Shamim", 20));
        map.put("Towhid", new Student("Towhid", 21));
        map.put("Kutubuddin", new Student("Kutubuddin", 25));

        System.out.println(map);
    }

}
