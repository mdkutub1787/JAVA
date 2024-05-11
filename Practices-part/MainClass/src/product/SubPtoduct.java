package product;

/**
 * @author MD KUTUB UDDIN
 */
public class SubPtoduct extends MedicineProduct {

    private int packSize;

    public SubPtoduct() {
    }

    public SubPtoduct(int packSize) {
        this.packSize = packSize;
    }

    public SubPtoduct(int packSize, String name, double regularPrice) {
        super(name, regularPrice);
        this.packSize = packSize;
    }

    @Override
    public double getSalePrice() {
        if (this.packSize > 500) {
            return super.getRegularPrice() - super.getRegularPrice() * .20;

        } else {
            return super.getRegularPrice();
        }
    }

}
