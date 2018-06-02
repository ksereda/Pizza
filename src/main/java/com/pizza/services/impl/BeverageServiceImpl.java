package com.Pizza.services.impl;

import com.Pizza.entity.Beverage;
import com.Pizza.repository.BeverageRepository;
import com.Pizza.services.BeverageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class BeverageServiceImpl implements BeverageService {

    @Autowired
    private BeverageRepository beverageRepository;

    @Override
    public List<Beverage> getBeverages() {
        List<Beverage> beverageList = new ArrayList<>();
        Iterator<Beverage> iterator = beverageRepository.findAll().iterator();
        while(iterator.hasNext())
            beverageList.add(iterator.next());
        return beverageList;
    }

    @Override
    public void addBeverage(Beverage beverage) {
        beverageRepository.save(beverage);
    }

    @Override
    public Beverage findByBeverageName(String beverageName) {
        return beverageRepository.findByName(beverageName);
    }

    @Override
    public void deleteBeverage(Beverage beverage) {
        beverageRepository.delete(beverage);
    }

    @Override
    public void updateBeverage(Beverage beverage) {
        Beverage tempBeverage = beverageRepository.findOne(beverage.getId());
        if (tempBeverage != null){
            beverage.setId(tempBeverage.getId());
            beverageRepository.save(beverage);
        }
    }
}
