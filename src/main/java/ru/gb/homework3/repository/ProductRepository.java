package ru.gb.homework3.repository;

import org.springframework.stereotype.Component;
import ru.gb.homework3.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Component("ProductRepository")
public class ProductRepository {

    private final List<Product> products = new ArrayList<>();
   // private final Map<Product, Integer> products1 = new HashMap<>();
    private int count;

//    @PostConstruct
//    public void init() {
//        System.out.println("at the start add 5 products");
//
//        products.add(new Product(1, "apple", 52d));
//        products.add(new Product(2, "milk", 60d));
//        products.add(new Product(3, "cookie", 100d));
//        products.add(new Product(4, "meat", 250d));
//        products.add(new Product(5, "orange", 80d));
//
//
//    }

    public List<Product> findAllList() {
        return new ArrayList<>(products);
    }

    public Optional<Product> findById(Integer id) {
        if (id < (products.size()) && id >= 0) {
            return Optional.of(products.get(id));
        } else {
            return Optional.empty();
        }

    }

    public Product save(Product product) {
        product.setId(count++);
        products.add(product);
        return Product.builder()
                .id(product.getId())
                .title(product.getTitle())
                .cost(product.getCost())
                .build();
    }

    public void add(Product product) {
        products.add(product);
    }

    public Product getRandomProduct() {
        return Product.builder()
                .id(getRandomProduct().getId())
                .title("Randomizer")
                .cost(5602d)
                .build();
    }

//    public  void deleteByProductId(Integer id) {
//        Product product = Product.builder().id(id).build();
//        if (products1.getOrDefault(product, 0) <= 1) {
//            if (products1.remove(product) == null) {
//                System.out.println("There isn't product with id = " + id + " in the cart");
//            }
//        } else {
//            products1.put(product, products1.get(product) - 1);
//        }
//    }

//    public Product edit(Product product) {
//        return products.set(product.getId(), product);
//    }
//

}
