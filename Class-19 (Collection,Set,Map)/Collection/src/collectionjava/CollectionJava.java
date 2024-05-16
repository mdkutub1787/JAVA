package collectionjava;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author MD KUTUB UDDIN
 */
public class CollectionJava {

    public static void main(String[] args) {
        //Element Add
        ArrayList<String> asia = new ArrayList<>();
        asia.add("Bangladesh");
        asia.add("India");
        asia.add("Nepal");
        asia.add("Pakistan");
        asia.add("Afghan");
        System.out.println(asia);

        ArrayList<String> america = new ArrayList<>();
        america.add("America");
        america.add("Canada");
        america.add("Brazil");
        america.add("Argentina");
        america.add("Peru");

        america.remove(2);

        System.out.println(america);

        //Clon 
        ArrayList<String> cl = (ArrayList<String>) (asia.clone());
        System.out.println(cl);

        //itarator
        Iterator itr = america.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

    }

}
