package com.Pizza.services.impl;

import com.Pizza.entity.Souse;
import com.Pizza.repository.SouseRepository;
import com.Pizza.services.SouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class SouseServiceImpl implements SouseService {

    @Autowired
    private SouseRepository souseRepository;

    @Override
    public void addSouse(Souse souse) {
        souseRepository.save(souse);
    }

    @Override
    public List<Souse> getSouse() {
        List<Souse> souseList = new ArrayList<>();
        Iterator<Souse> iterator = souseRepository.findAll().iterator();
        while(iterator.hasNext())
            souseList.add(iterator.next());
        return souseList;
    }

    @Override
    public Souse findBySouseName(String name) {
        return souseRepository.findByName(name);
    }

    @Override
    public void deleteSouse(Souse souse) {
        souseRepository.delete(souse);
    }

    @Override
    public void updateSouse(Souse souse) {
        Souse tempSouse = souseRepository.findOne(souse.getId());
        if (tempSouse != null){
            souse.setId(tempSouse.getId());
            souseRepository.save(souse);
        }
    }
}
