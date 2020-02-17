package com.withgoogle.hashcode.models;

public enum Ingredient {
    T("T"),
    M("M");

    private final String ingredient;

    Ingredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public static Ingredient fromString(String actualIngredient) throws Exception {

        for (Ingredient i : Ingredient.values()) {
            if (i.ingredient.equalsIgnoreCase(actualIngredient)) {
                return i;
            }
        }

        throw new Exception("fail");
    }
}
