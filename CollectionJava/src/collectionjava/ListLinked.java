package collectionjava;

import java.util.LinkedList;

/**
 * @author MD KUTUB UDDIN
 */
public class ListLinked {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Bangladesh");
        list.add("India");
        list.add("Nepal");
        list.add("Pakistan");
        list.add("Afghan");
        System.out.println(list);

        list.add(3, "Japan");
        list.add("Bhutan");
        System.out.println(list);
        list.remove("Nepal");
        System.out.println(list);

    }

}
