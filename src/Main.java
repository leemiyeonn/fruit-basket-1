import app.Cart;
import app.Menu;
import app.Order;
import app.OrderApp;
import appConfigurer.AppConfigurer;
import repository.ProductRepository;

import javax.print.attribute.standard.Media;

public class Main {
    public static void main(String[] args) {

        AppConfigurer appConfigurer = new AppConfigurer();
        ProductRepository productRepository = appConfigurer.productRepository();
        Cart cart = appConfigurer.cart();
        Menu menu = appConfigurer.menu(productRepository.getFruits());
        Order order = appConfigurer.order(cart);

        OrderApp orderApp = new OrderApp(
                productRepository,menu,cart,order
        );

        orderApp.start();
    }
}