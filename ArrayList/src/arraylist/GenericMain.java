package arraylist;

public class GenericMain {

    public static void main(String[] args) {
        GenericArrayList<Integer> name = new GenericArrayList<>();

        GenericArrayList<String> name2 = new GenericArrayList<>();
        
        name.setT(20);
        name2.setT("Hello World");

        System.out.println(name);
        System.out.println(name2);

    }
}
