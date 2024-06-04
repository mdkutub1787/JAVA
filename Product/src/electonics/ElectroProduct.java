
package electonics;


public class ElectroProduct {
    private double warrantyPeriod;

    public ElectroProduct() {
    }

    public ElectroProduct(double warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public double getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(double warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    
    public double getSalePrice() {
    if (warrantyPeriod > 1) {
            return getRegularPrice() * 0.85; // 15% discount
        } else {
            return getRegularPrice(); // No discount
        }
    
    
    }
    
}
