package com.pizza.services.impl;

import com.pizza.entity.Sushi;
import com.pizza.repository.SushiRepository;
import com.pizza.services.SushiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class SushiServiceImpl implements SushiService {


    @Autowired
    private SushiRepository sushiRepository;

    @Override
    public List<Sushi> getSushis() {
        List<Sushi> testList = new ArrayList<>();
        Iterator<Sushi> iterator = sushiRepository.findAll().iterator();
        while(iterator.hasNext())
            testList.add(iterator.next());
        return testList;
    }

    @Override
    public void addSushi(Sushi sushi) {
        sushiRepository.save(sushi);
    }

    @Override
    public Sushi findBySushiName(String sushiName) {
        return sushiRepository.findByName(sushiName);
    }

    @Override
    public void deleteSushi(Sushi sushi) {
        sushiRepository.delete(sushi);
    }

    @Override
    public void updateSushi(Sushi sushi) {
        Sushi tempSushi = sushiRepository.findOne(sushi.getId());
        if (tempSushi != null){
            sushi.setId(tempSushi.getId());
            sushiRepository.save(sushi);
        }
    }

}
