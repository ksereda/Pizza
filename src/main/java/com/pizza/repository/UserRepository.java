package com.pizza.repository;

import com.pizza.entity.Role;
import com.pizza.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByLogin(String login);

    User findById(Integer id);

    List<User> findAllByRole(Role role);

}
