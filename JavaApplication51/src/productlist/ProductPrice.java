package productlist;

import product.SubClass;

/**
 *
 * @author MD KUTUB UDDIN
 */
public class ProductPrice {

    public static void main(String[] args) {

        SubClass s = new SubClass(600, "Napa", 500);
        System.out.println( s.salesPrice());
    }

}
