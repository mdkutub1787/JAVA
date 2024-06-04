package product;

public class ProductMain {

    public static void main(String[] args) {
        
        Product product=new Product("Pc", 20000);

        System.out.println("Product Name: " + product.getName());
        System.out.println("Regular Price: " + product.getRegularPrice());
        System.out.println("Sale Price:" + product.getSalePrice());

    }
}
