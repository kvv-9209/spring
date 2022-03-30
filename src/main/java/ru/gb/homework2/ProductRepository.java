package ru.gb.homework2;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Profile("product")
public class ProductRepository implements MessageProvider {

    private Map<Integer, Product> products = new HashMap<>();

    private Product p1 = new Product(1, "apple", 52f);
    private Product p2 = new Product(2, "milk", 60f);
    private Product p3 = new Product(3, "cookie", 100f);
    private Product p4 = new Product(4, "meat", 250f);
    private Product p5 = new Product(5, "orange", 80f);


    @Override
    public String getMessage() {
        return "get the whole list or one product by id";
    }

    @PostConstruct
    public void init() {
        System.out.println("at the start add 5 products");

        products.put(p1.getId(), p1);
        products.put(p2.getId(), p2);
        products.put(p3.getId(), p3);
        products.put(p4.getId(), p4);
        products.put(p5.getId(), p5);

    }

    public List<Product> getAllList() {
        return new ArrayList<>(products.values());
    }

    public Product findById(Integer id) {
        return products.get(id);
    }
}

