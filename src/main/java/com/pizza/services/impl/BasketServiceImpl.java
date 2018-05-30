package com.pizza.services.impl;

import com.pizza.entity.Basket;
import com.pizza.repository.BasketRepository;
import com.pizza.services.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BasketServiceImpl implements BasketService {

    @Autowired
    private BasketRepository basketRepository;

    @Override
    public List<Basket> findByOrderId(Integer orderId) {
        return basketRepository.findByOrderId(orderId);
    }

}
