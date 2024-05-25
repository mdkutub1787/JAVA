package febonacciofmathod;

public class SubFebonacci {

    private long index;

    public SubFebonacci() {
    }

    public SubFebonacci(long index) {
        this.index = index;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "SubFebonacci{" + "index=" + index + '}';
    }

    public long febonacci(long index) {

        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;

        } else {

            return febonacci(index - 1) + febonacci(index - 2);
        }

    }

}
