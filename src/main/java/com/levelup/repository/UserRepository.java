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
    public void createUser (User user);
    public void updateUser (User user);
    public User findById (long id);
    public List<User> getAllUsers ();
    public void deleteById (long id);
    public boolean isUserExist(long id);

}
