package com.pizza.services.impl;

import com.pizza.entity.Office;
import com.pizza.repository.OfficeRepository;
import com.pizza.services.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OfficeServiceImpl implements OfficeService {

    @Autowired
    private OfficeRepository officeRepository;

    @Override
    public List<Office> getOffices() {
        List<Office> officesList = new ArrayList<>();
        Iterator<Office> iterator = officeRepository.findAll().iterator();
        while(iterator.hasNext())
            officesList.add(iterator.next());
        return officesList;
    }

    @Override
    public List<Office> findByOfficeId(Integer officeId) {
        return officeRepository.findByOfficeId(officeId);
    }


}
