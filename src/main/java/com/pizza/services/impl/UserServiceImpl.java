package com.Pizza.services.impl;

import com.Pizza.entity.Role;
import com.Pizza.entity.User;
import com.Pizza.repository.RoleRepository;
import com.Pizza.repository.UserRepository;
import com.Pizza.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public List<User> getUsers() {
        Role role = roleRepository.findByCustomer(1);
        List <User> userList = userRepository.findAllByRole(role);
        return userList;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();
        Iterator<User> iterator = userRepository.findAll().iterator();
        while (iterator.hasNext())
            userList.add(iterator.next());
        return userList;
    }

    @Override
    public Role getExecutorRole() {
        return roleRepository.findByExecutor(1);
    }

    @Override
    public Role getAdminRole() {
        return roleRepository.findByAdmin(1);
    }

    @Override
    public Role getCustomerRole() {
        return roleRepository.findByCustomer(1);
    }

    @Override
    public User findByLogin(String userLogin) {
        return userRepository.findByLogin(userLogin);
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Role role = roleRepository.findByCustomer(1);
        user.setRole(role);
        userRepository.save(user);
    }
}
