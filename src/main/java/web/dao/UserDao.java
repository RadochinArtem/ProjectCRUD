package web.dao;

import web.entity.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User getUser(Long id);

    List<User> getAllUsers();
}
