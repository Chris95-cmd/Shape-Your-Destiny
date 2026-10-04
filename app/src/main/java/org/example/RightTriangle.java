package org.example;

public class RightTriangle extends Shape implements Polygon {
    private double length;
    private double width;

    public RightTriangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return 0.5 * length * width;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(length * length + width * width);
        return length + width + hypotenuse;
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}
