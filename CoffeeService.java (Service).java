package com.coffeeshop.service;

import com.coffeeshop.model.Coffee;

import java.util.List;

public interface CoffeeService {
    List<Coffee> getAllCoffees();
    void saveCoffee(Coffee coffee);
}
