package generics;

/**
 * @author MD KUTUB UDDIN
 */
public class Geometry<N> {

    private N color;
    private N filled;

    public Geometry() {
    }

    public Geometry(N color, N filled) {
        this.color = color;
        this.filled = filled;
    }

    public N getColor() {
        return color;
    }

    public void setColor(N color) {
        this.color = color;
    }

    public N getFilled() {
        return filled;
    }

    public void setFilled(N filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Geometry{" + "color=" + color + ", filled=" + filled + '}';
    }

    public <N> void getArea(){
    
    }

    public <N> void getPerimetar(){
    
    }

}
