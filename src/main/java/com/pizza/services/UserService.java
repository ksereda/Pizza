package com.Pizza.services;

import com.Pizza.entity.Role;
import com.Pizza.entity.User;
import java.util.List;

public interface UserService {

    List<User> getUsers();

    List<User> getAllUsers();

    User findByLogin(String userLogin);

    User findById(int id);

    void saveUser(User user);

    void save(User user);

    Role getExecutorRole();

    Role getAdminRole();

    Role getCustomerRole();
}
