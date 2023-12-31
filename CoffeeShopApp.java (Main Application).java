package com.coffeeshop;

import com.coffeeshop.model.Coffee;
import com.coffeeshop.service.CoffeeService;
import com.coffeeshop.service.CoffeeServiceImpl;

import java.util.Scanner;

public class CoffeeShopApp {
    private static CoffeeService coffeeService = new CoffeeServiceImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        // Implement the user interaction logic here
        // For example, asking for coffee size, additional options, etc.
    }
}

