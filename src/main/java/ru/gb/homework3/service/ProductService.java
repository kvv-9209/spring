package ru.gb.homework3.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.homework3.model.Product;
import ru.gb.homework3.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;


    public Product findById(Integer id) {
        return productRepository.findById(id).orElse(new Product());
    }

    public List<Product> findAll() {
        return productRepository.findAllList();
    }

  //  public void deleteById(Integer id) {
//        cart.deleteByProductId(id);
//    }

    public void add(Product product) {
        productRepository.add(product);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

}
