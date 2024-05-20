
package arraylist;


public class ArrayList <T>{

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        ArrayList<Integer> integer = new ArrayList<>();
        ArrayList<String> string= new ArrayList<>();

        integer.set(10);
        string.set("Hello World");

        System.out.println("Integer Value: " + integer.get());
        System.out.println("String Value: " + string.get());
    }
}
