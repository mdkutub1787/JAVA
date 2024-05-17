package abstracepractce;

public class Triangle extends Super {

    private int length;
    private int length1;
    private int length2;

    public Triangle() {
    }

    public Triangle(int length, int length1, int length2) {
        this.length = length;
        this.length1 = length1;
        this.length2 = length2;
    }

    public Triangle(int length, int length1, int length2, String color) {
        super(color);
        this.length = length;
        this.length1 = length1;
        this.length2 = length2;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength1() {
        return length1;
    }

    public void setLength1(int length1) {
        this.length1 = length1;
    }

    public int getLength2() {
        return length2;
    }

    public void setLength2(int length2) {
        this.length2 = length2;
    }



    @Override
    public void getArea() {
        System.out.println("Triangle :"+length + length1 + length2);

    }

}
