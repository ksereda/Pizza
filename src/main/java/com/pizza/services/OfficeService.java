package com.Pizza.services;

import com.Pizza.entity.Office;
import java.util.List;

public interface OfficeService {

    List<Office> getOffices();

    List<Office> findByOfficeId(Integer officeId);

}
