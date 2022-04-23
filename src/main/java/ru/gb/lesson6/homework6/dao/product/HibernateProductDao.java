//package ru.gb.lesson6.homework6.dao.product;
//
//import lombok.RequiredArgsConstructor;
//import org.hibernate.SessionFactory;
//import org.springframework.transaction.annotation.Transactional;
//import ru.gb.lesson6.homework6.entity.Product;
//
//import java.util.List;
//
//@RequiredArgsConstructor
////@Component
//public class HibernateProductDao implements ProductDao {
//
//    private final SessionFactory sessionFactory;
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<Product> findAll() {
//        return sessionFactory.getCurrentSession().createQuery("from Product p").list();
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public Product findById() {
//        return null;
//    }
//
//    @Override
//    @Transactional
//    public Product save(Product product) {
//        sessionFactory.getCurrentSession().saveOrUpdate(product);
//        return product;
//    }
//
//    @Override
//    @Transactional
//    public void delete(Product product) {
//        sessionFactory.getCurrentSession().delete(product);
//    }
//}
