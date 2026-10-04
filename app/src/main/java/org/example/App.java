package org.example;

public class App {
  public static void main(String[] args) {
    Circle circle = new Circle(2);
    Rectangle rectangle = new Rectangle(3, 4);
    RightTriangle triangle = new RightTriangle(3, 4);
    Square square = new Square(5);
    IsoscelesRightTriangle isoTriangle = new IsoscelesRightTriangle(1);

    System.out.println("Circle");
    System.out.println("Area: " + circle.getArea());
    System.out.println("Perimeter: " + circle.getPerimeter());
    System.out.println();

    System.out.println("Rectangle");
    System.out.println("Area: " + rectangle.getArea());
    System.out.println("Perimeter: " + rectangle.getPerimeter());
    System.out.println("Sides: " + rectangle.numberOfSides());
    System.out.println();

    System.out.println("Right Triangle");
    System.out.println("Area: " + triangle.getArea());
    System.out.println("Perimeter: " + triangle.getPerimeter());
    System.out.println("Sides: " + triangle.numberOfSides());
    System.out.println();

    System.out.println("Square");
    System.out.println("Area: " + square.getArea());
    System.out.println("Perimeter: " + square.getPerimeter());
    System.out.println("Sides: " + square.numberOfSides());
    System.out.println();

    System.out.println("Isosceles Right Triangle");
    System.out.println("Area: " + isoTriangle.getArea());
    System.out.println("Perimeter: " + isoTriangle.getPerimeter());
    System.out.println("Sides: " + isoTriangle.numberOfSides());
  }
}
