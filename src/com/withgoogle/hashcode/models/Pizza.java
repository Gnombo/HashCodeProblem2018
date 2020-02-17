package com.withgoogle.hashcode.models;

import java.util.List;

public class Pizza {

    private List<List<Ingredient>> pizza;

    public Pizza(List<List<Ingredient>> pizza) {
        this.pizza = pizza;
    }

    public List<List<Ingredient>> getPizza() {
        return pizza;
    }
}
