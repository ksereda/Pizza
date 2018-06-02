package com.Pizza.services.impl;
import com.Pizza.entity.Office;
import com.Pizza.repository.OfficeRepository;
import com.Pizza.services.OfficeService;
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
