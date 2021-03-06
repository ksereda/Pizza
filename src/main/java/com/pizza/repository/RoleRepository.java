package com.Pizza.repository;

import com.Pizza.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByAdmin(Integer admin);

    Role findByCustomer(Integer customer);

    Role findByExecutor(Integer executor);

}
