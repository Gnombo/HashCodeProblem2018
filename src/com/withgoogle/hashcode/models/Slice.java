package com.withgoogle.hashcode.models;

public class Slice {

    private Point topLeft;
    private Point bottomRight;

    public Slice() {}

    public Slice(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Boolean isValid(Pizza pizza) {
        return true;
    }
}
