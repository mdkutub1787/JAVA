package recursionmathod;

public class SubRecursion {

   private int s ;

    public SubRecursion() {
    }

    public SubRecursion(int s) {
        this.s = s;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "SubRecursion{" + "s=" + s + '}';
    }
   
   

    public int factorial(int s) {
        if (s == 0) {
            return 1;
        } else {
            return s * factorial(s - 1);
        }

    }

}
