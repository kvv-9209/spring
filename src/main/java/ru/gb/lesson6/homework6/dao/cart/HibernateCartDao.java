package ru.gb.lesson6.homework6.dao.cart;

import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.lesson6.homework6.entity.Cart;

//@Component
@RequiredArgsConstructor
public class HibernateCartDao implements CartDao {

    private final SessionFactory sessionFactory;

    @Override
    @Transactional
    public Cart save(Cart cart) {
        sessionFactory.getCurrentSession().saveOrUpdate(cart);
        return cart;
    }
}
