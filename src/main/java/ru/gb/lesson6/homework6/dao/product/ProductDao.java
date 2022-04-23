package ru.gb.lesson6.homework6.dao.product;

import ru.gb.lesson6.homework6.entity.Product;

public interface ProductDao {
    Iterable<Product> findAll();

    Product findById(Long id);

    Product save(Product product);

    void delete(Product product);
}
