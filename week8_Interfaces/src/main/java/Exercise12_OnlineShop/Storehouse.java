package Exercise12_OnlineShop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse() {
        prices = new HashMap<>();
        stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        if (prices.containsKey(product)) {
            return prices.get(product);
        }
        else {
            return -99;
        }
    }

    public int stock(String product) {
        if(stocks.containsKey(product)) {
            return stocks.get(product);
        }
        else {
            return 0;
        }
    }

    public boolean take(String product) {
        int stock = stock(product);

        if (stock > 0) {
            stocks.put(product, stocks.get(product) - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        Set<String> set = new HashSet<>();
        for (String product: prices.keySet()) {
            set.add(product);
        }
        return set;
    }
}
