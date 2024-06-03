package recursionmathod;

public class SubRecursion {

    private int number;

    public SubRecursion() {
    }

    public SubRecursion(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "SubRecursion{" + "number=" + number + '}';
    }

    public int factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }

    }

}
