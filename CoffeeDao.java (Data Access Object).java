package com.coffeeshop.dao;

import com.coffeeshop.model.Coffee;

import java.util.List;

public interface CoffeeDao {
    List<Coffee> getAllCoffees();
    void saveCoffee(Coffee coffee);
}
