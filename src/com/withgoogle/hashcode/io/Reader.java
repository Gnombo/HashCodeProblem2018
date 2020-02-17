package com.withgoogle.hashcode.io;

import com.withgoogle.hashcode.models.DataSet;
import com.withgoogle.hashcode.models.Ingredient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public DataSet read(String filePath) throws Exception {

        DataSet dataSet = new DataSet();

        File file = new File(filePath);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String firstLine = br.readLine();

        String[] splittedFirstLine = firstLine.split(" ");

        dataSet.setRows(Integer.parseInt(splittedFirstLine[0]));
        dataSet.setColumns(Integer.parseInt(splittedFirstLine[1]));
        dataSet.setMinimumIngredientsOfEachTypePerSlice(Integer.parseInt(splittedFirstLine[2]));
        dataSet.setMaximumCellsPerSlice(Integer.parseInt(splittedFirstLine[3]));

        List<List<Ingredient>> pizza = new ArrayList<>();

        for (int i = 0; i < dataSet.getRows(); i++) {

            String line = br.readLine();

            List<Ingredient> ingredients = new ArrayList<>();

            for (int j = 0; j < dataSet.getColumns(); j++) {

                String actualIngredient = line.charAt(j) + "";

                Ingredient ingredient = Ingredient.fromString(actualIngredient);

                ingredients.add(ingredient);
            }

            pizza.add(ingredients);
        }

        dataSet.setPizza(pizza);

        br.close();

        return dataSet;
    }

}
