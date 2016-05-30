package com.levelup.repository;

import com.levelup.model.User;

import java.util.List;

/**
 * Class {@link com.levelup.repository.UserRepository}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

public interface UserRepository {

    /**
     * Persists new entity
     *
     * @param user
     */
    void createUser(User user);

    /**
     * Updates new entity
     *
     * @param user
     */
    void updateUser(User user);

    User findById(long id);

    User findByEmail(String email);

    /**
     * @return list with every {@link User} entity, persisted in database
     */
    List<User> getAllUsers();

    void deleteById(long id);

    boolean isUserExist(long id);

}
