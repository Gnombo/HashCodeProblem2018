package com.withgoogle.hashcode.models;

import java.util.List;

public class DataSet {

    private Integer rows;
    private Integer columns;

    private Integer minimumIngredientsOfEachTypePerSlice;
    private Integer maximumCellsPerSlice;

    private List<List<Ingredient>> pizza;

    public DataSet() {}

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Integer getMinimumIngredientsOfEachTypePerSlice() {
        return minimumIngredientsOfEachTypePerSlice;
    }

    public void setMinimumIngredientsOfEachTypePerSlice(Integer minimumIngredientsOfEachTypePerSlice) {
        this.minimumIngredientsOfEachTypePerSlice = minimumIngredientsOfEachTypePerSlice;
    }

    public Integer getMaximumCellsPerSlice() {
        return maximumCellsPerSlice;
    }

    public void setMaximumCellsPerSlice(Integer maximumCellsPerSlice) {
        this.maximumCellsPerSlice = maximumCellsPerSlice;
    }

    public List<List<Ingredient>> getPizza() {
        return pizza;
    }

    public void setPizza(List<List<Ingredient>> pizza) {
        this.pizza = pizza;
    }

    @Override
    public String toString() {
        return "DataSet {" +
                "\n rows=" + rows +
                ",\n columns=" + columns +
                ",\n minimumIngredientsOfEachTypePerSlice=" + minimumIngredientsOfEachTypePerSlice +
                ",\n maximumCellsPerSlice=" + maximumCellsPerSlice +
                ",\n pizza=" + pizza +
                "\n}";
    }
}
