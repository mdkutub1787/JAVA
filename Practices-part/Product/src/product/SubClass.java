package product;

/**
 * @author MD KUTUB UDDIN
 */
public class SubClass extends SuperClass {

    private int packSize;

    public SubClass() {
    }

    public SubClass(int packSize) {
        this.packSize = packSize;
    }

    public SubClass(int packSize, String name, double regularPrice) {
        super(name, regularPrice);
        this.packSize = packSize;
    }

    public int getPackSize() {
        return packSize;
    }

    public void setPackSize(int packSize) {
        this.packSize = packSize;
    }

    @Override
    public double salesPrice() {

        if (this.packSize > 500) {
            return super.getRegularPrice() - super.getRegularPrice() * .20;
        } else {
            return super.getRegularPrice();
        }
    }

}
