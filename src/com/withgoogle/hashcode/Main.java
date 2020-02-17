package com.withgoogle.hashcode;

import com.withgoogle.hashcode.io.Reader;
import com.withgoogle.hashcode.models.DataSet;

class Main {

    private static Reader reader = new Reader();

    private static final String EXAMPLE = "inputs/example.in";
    private static final String SMALL = "inputs/small.in";
    private static final String MEDIUM = "inputs/medium.in";
    private static final String BIG = "inputs/big.in";

    public static void main(String[] args) throws Exception {

        DataSet dataSet = reader.read(MEDIUM);

        System.out.println(dataSet.toString());
        // System.out.println("T: " + dataSet.countTomatoes());
        // System.out.println("T: " + dataSet.countMushrooms());

        new PizzaSlicesCalculator().calculatePossibleSlices(dataSet);
    }
}
