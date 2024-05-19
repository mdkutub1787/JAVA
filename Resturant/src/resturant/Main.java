package resturant;

public class Main {

    public static void main(String[] args) {

   Resturant restaurant = new Resturant();

        // Adding menu items
        restaurant.addMenuItem("Burger", "A delicious burger", 5.99);
        restaurant.addMenuItem("Pizza", "Tasty pizza with toppings", 8.99);
        restaurant.addMenuItem("Salad", "Fresh garden salad", 4.99);

        // Creating an order
        Order order = restaurant.createOrder();
        order.addItem(restaurant.getMenuItem("Burger"));
        order.addItem(restaurant.getMenuItem("Pizza"));
        order.addItem(restaurant.getMenuItem("Salad"));

        // Calculating total
        double total = order.getTotal();
        System.out.println("Total: $" + total);
    }
}