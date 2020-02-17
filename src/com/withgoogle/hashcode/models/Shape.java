package com.withgoogle.hashcode.models;

public class Shape {

    private Integer height;
    private Integer width;

    public Shape(Integer height, Integer width) {
        this.height = height;
        this.width = width;
    }

    public Integer size() {
        return height * width;
    }

    public Shape transpose() {
        return new Shape(width, height);
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                ", width=" + width +
                ", size=" + this.size() +
                '}';
    }
}
