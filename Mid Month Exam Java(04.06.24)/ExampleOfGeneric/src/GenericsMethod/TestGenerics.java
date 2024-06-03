package GenericsMethod;

public class TestGenerics {

    public static void main(String[] args) {

        Student<String, Integer, Integer> s1 = new Student<>("Sahabuddin", 1245620, 20);
        Student<String, Integer, Integer> s2 = new Student<>("Kutub Uddin", 1281514, 23);
        System.out.println(s1);
        System.out.println(s2);

    }
}
