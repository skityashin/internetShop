package com.levelup.repository.impl;

import com.levelup.model.User;
import com.levelup.repository.UserRepository;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Class {@link com.levelup.repository.impl.UserRepositoryImpl}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository{

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * {@inheritDoc}
     */
    @Override
    public void createUser(User user) {
        if(user == null) {
            throw new IllegalArgumentException("User cannot be null");
        } entityManager.persist(user);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User findById(long id) {
        return entityManager.find(User.class, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public User findByEmail(String email) {
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.email = :email");
        query.setParameter("email", email);
        List<User> users = query.getResultList();
        if (!CollectionUtils.isEmpty(users)) {
            return users.get(0);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<User> getAllUsers() {
        Query query = entityManager.createQuery("FROM User");
        return (List<User>)query.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteById(long id) {
        User removingUser = entityManager.find(User.class, id);
        entityManager.remove(removingUser);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isUserExist(long id) {
        return entityManager.contains(id);
    }

}
