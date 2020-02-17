package com.withgoogle.hashcode;

import com.withgoogle.hashcode.models.DataSet;
import com.withgoogle.hashcode.models.Ingredient;
import com.withgoogle.hashcode.models.Shape;
import com.withgoogle.hashcode.models.Slice;

import java.util.ArrayList;
import java.util.List;

public class PizzaSlicesCalculator {

    public List<Slice> calculatePossibleSlices(DataSet dataSet) {

        List<Shape> possibleShapes = this.calculatePossibleShapeSlices(dataSet);

        System.out.println(possibleShapes);




        return null;
    }

    private List<Shape> calculatePossibleShapeSlices(DataSet dataSet) {

        List<Shape> results = new ArrayList<>();

        for (int i = 1; i <= dataSet.getMaximumCellsPerSlice(); i++) {

            for (int j = 1; j <= i; j++) {

                Shape shape = new Shape(i, j);

                if (shape.size() >= dataSet.getMinimumSliceSize() && shape.size() <= dataSet.getMaximumCellsPerSlice()) {
                    results.add(shape);
                }
            }
        }

        return results;
    }

}
