package com.withgoogle.hashcode;

import com.withgoogle.hashcode.io.Reader;
import com.withgoogle.hashcode.models.DataSet;

class Main {

    public static void main(String[] args) throws Exception {

        DataSet dataSet = new Reader().read("inputs/small.in");

        System.out.println(dataSet.toString());
    }
}
