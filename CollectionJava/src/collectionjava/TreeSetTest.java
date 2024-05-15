package collectionjava;

;
import java.util.TreeSet;

/**
 * @author MD KUTUB UDDIN
 */


public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("America");
        tSet.add("Canada");
        tSet.add("Brazil");
        tSet.add("Argentina");
        tSet.add("Peru");
        tSet.remove(tSet.first());
        System.out.println(tSet);

        System.out.println(tSet.last());
    }
}
