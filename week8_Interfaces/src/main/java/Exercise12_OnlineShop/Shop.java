package Exercise12_OnlineShop;

import java.util.Scanner;

public class Shop {
    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader){
        this.store = store;
        this.reader = reader;
    }

    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("Below is our sale offer:");

        for (String product : store.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What do you want to buy (press enter to pay):");
            String product = reader.nextLine();
            if (product.isEmpty()) {
                break;
            }
            else {
                if (store.stock(product) > 0) {
                    store.take(product);
                    basket.add(product, store.price(product));
                }
                else {
                    System.out.println("We actually do not have this product in stock");
                }
            }

            System.out.println("In your basket now: ");
            basket.print();
            System.out.println("basket price: " + basket.price() +"\n");
        }
    }
}
