package app;

import appConfigurer.AppConfigurer;
import repository.ProductRepository;

import java.util.Scanner;


public class OrderApp {

    private ProductRepository productRepository;
    private Menu menu;
    private Cart cart;
    private Order order;

    public OrderApp(ProductRepository productRepository, Menu menu, Cart cart, Order order) {
        this.productRepository = productRepository;
        this.menu = menu;
        this.cart = cart;
        this.order = order;
    }

    public void start(){


        System.out.println(" 🍽️ fruit basket 🍽️ ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu.printMenu();
            String input = scanner.nextLine();

            if (input.equals("+")){
                order.makeorder();
                break;
            }

            else {
                int menuNumber = Integer.parseInt(input);

                if (menuNumber == 0) cart.printCart();
                else if (1 <= menuNumber && menuNumber <= productRepository.getFruits().size()) {
                    cart.addToCart(menuNumber);
                }
            }
        }
    };
}
