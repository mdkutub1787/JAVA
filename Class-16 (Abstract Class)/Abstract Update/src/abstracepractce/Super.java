package abstracepractce;

public abstract class Super {

    private String color;

    public Super() {
    }

    public Super(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Super{" + "color=" + color + '}';
    }

    public abstract void getArea();

 
}
