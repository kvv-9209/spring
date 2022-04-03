package ru.gb.homework2;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Profile("Cart")
public class Cart implements MessageProvider {
    @Override
    public String getMessage() {
        return "add or remove";
    }

    private Map<Product, Integer> cartMap = new HashMap<>();


    public void add(Product product, Integer quantity) {
        if (product != null)
            cartMap.merge(product, quantity, Integer::sum);
    }

    public void del(Product product, Integer quantity) {
        if (cartMap.containsKey(product)) {
            if (quantity != null && cartMap.get(product).compareTo(quantity) > 0) {
                cartMap.put(product, cartMap.get(product) - quantity);
            } else {
                cartMap.remove(product);
            }
        }
    }

}
