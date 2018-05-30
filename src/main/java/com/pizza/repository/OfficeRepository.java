package com.pizza.repository;

import com.pizza.entity.Office;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OfficeRepository extends CrudRepository<Office, Integer> {

    List<Office> findByOfficeId(Integer officeId);

}
