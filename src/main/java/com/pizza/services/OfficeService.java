package com.pizza.services;

import com.pizza.entity.Office;

import java.util.List;

public interface OfficeService {

    List<Office> getOffices();

    List<Office> findByOfficeId(Integer officeId);

}
