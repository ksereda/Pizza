package com.Pizza.services.impl;

import com.Pizza.entity.Role;
import com.Pizza.entity.User;
import com.Pizza.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userRepository.findByLogin(login);
        if (user == null) {
            throw new UsernameNotFoundException("User with name " + login + " not found");
        }
        Role role = user.getRole();
        String userRole;
        if (role.getAdmin() == 1) {
            userRole = "ADMIN";
        } else if (role.getExecutor() == 1) {
            userRole = "EXECUTOR";
        } else  {
            userRole = "CUSTOMER";
        }
        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
        GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + userRole);
        grantList.add(authority);
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
                user.getLogin(),
                String.valueOf(user.getPassword()),
                grantList
        );
        return userDetails;
    }

}
