package ru.gb.lesson6.homework6.dao.product;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.lesson6.homework6.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Repository
@Transactional
public class EntityManagerProductDao implements ProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Iterable<Product> findAll() {
        return entityManager.createQuery("select p from Product p").getResultList();
    }

    @Override
    public Product findById(Long id) {
        TypedQuery<Product> namedQuery = entityManager.createNamedQuery("Product.findById", Product.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public void delete(Product product) {

    }
}
