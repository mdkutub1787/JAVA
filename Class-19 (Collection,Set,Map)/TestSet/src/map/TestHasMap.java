package map;

import java.util.HashMap;

/**
 * @author MD KUTUB UDDIN
 */
public class TestHasMap {

    public static void main(String[] args) {
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();
        hMap.put(101, "Kutub");
        hMap.put(102, "Shahab");
        hMap.put(103, "Rofik");

        System.out.println(hMap.get(101));
        System.out.println(hMap.get(102));
        System.out.println(hMap.get(103));

    }
}
