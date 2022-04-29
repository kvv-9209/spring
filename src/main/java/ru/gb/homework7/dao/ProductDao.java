package ru.gb.homework7.dao;


import ru.gb.homework7.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();

    Product findById(Long id);

    Product save(Product product);

    void delete(Product product);
}
