package appConfigurer;

import app.Cart;
import app.Menu;
import app.Order;
import product.Fruit;
import repository.ProductRepository;

import java.util.ArrayList;

public class AppConfigurer {


    public ProductRepository productRepository(){
        return new ProductRepository();
    }


    public Cart cart(){
        return new Cart();
    }

    public Menu menu(ArrayList<Fruit> fruits) {
        return new Menu(fruits);
    }

    public Order order(Cart cart) {
        return new Order(cart);
    }


}
