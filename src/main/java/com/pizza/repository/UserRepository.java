package com.Pizza.repository;

import com.Pizza.entity.Role;
import com.Pizza.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByLogin(String login);

    User findById(Integer id);

    List<User> findAllByRole(Role role);

}
