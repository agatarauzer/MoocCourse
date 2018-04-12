package Exercise12_OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> basket;

    public ShoppingBasket(){
        basket = new HashMap<>();
    }

    public void add(String product, int price) {
        if (!basket.containsKey(product)) {
            Purchase purchase = new Purchase(product, 1, price);
            basket.put(product, purchase);
        }
        else {
            basket.get(product).increaseAmount();
        }
    }

    public int price() {
        int totalPrice = 0;
        for (String product : basket.keySet()) {
            Purchase purchase = basket.get(product);
            totalPrice += purchase.price();
        }
        return totalPrice;
    }

    public void print() {
        for (String product: basket.keySet()) {
            System.out.println(basket.get(product) + ", price: " + basket.get(product).price());
        }
    }
}
