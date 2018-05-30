package com.pizza.services.impl;

import com.pizza.entity.*;
import com.pizza.repository.*;
import com.pizza.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private SouseRepository souseRepository;

    @Autowired
    private BeverageRepository beverageRepository;

    @Autowired
    private SushiRepository sushiRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    @Override
    public void updateProduct(Product product) {
        Product tempProduct = productRepository.findOne(product.getId());
        if (tempProduct != null){
            product.setId(tempProduct.getId());
            productRepository.save(product);
        }
    }

    @Override
    public List<Product> getProduct() {
        List<Product> productList = new ArrayList<>();
        Iterator<Product> iterator = productRepository.findAll().iterator();
        while(iterator.hasNext())
            productList.add(iterator.next());
        return productList;
    }

    @Override
    public List<Pizza> getPizzaList() {
        List<Pizza> resultPizzaList = new ArrayList<>();
        Iterator<Pizza> it = pizzaRepository.findAll().iterator();
        while (it.hasNext())
            resultPizzaList.add(it.next());
        return resultPizzaList;
    }

    @Override
    public List<Souse> getSouseList() {
        List<Souse> resultSouseList = new ArrayList<>();
        Iterator<Souse> it = souseRepository.findAll().iterator();
        while (it.hasNext())
            resultSouseList.add(it.next());
        return resultSouseList;
    }

    @Override
    public List<Beverage> getBeverageList() {
        List<Beverage> resultBeverageList = new ArrayList<>();
        Iterator<Beverage> it = beverageRepository.findAll().iterator();
        while (it.hasNext())
            resultBeverageList.add(it.next());
        return resultBeverageList;
    }

    @Override
    public List<Sushi> getSushiList() {
        List<Sushi> resultSushiList = new ArrayList<>();
        Iterator<Sushi> it = sushiRepository.findAll().iterator();
        while (it.hasNext())
            resultSushiList.add(it.next());
        return resultSushiList;
    }
}
