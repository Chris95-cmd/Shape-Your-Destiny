package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  public void testCircle() {
    Circle c = new Circle(2);
    assertEquals(4 * Math.PI, c.getArea());
    assertEquals(4 * Math.PI, c.getPerimeter());
  }

  @Test
  public void testRectangle() {
    Rectangle r = new Rectangle(3, 4);
    assertEquals(12, r.getArea());
    assertEquals(14, r.getPerimeter());
  }

  @Test
  public void testRightTriangle() {
    RightTriangle t = new RightTriangle(3, 4);
    assertEquals(6, t.getArea());
    assertEquals(12, t.getPerimeter());
  }

  @Test
  public void testSquare() {
    Square s = new Square(5);
    assertEquals(25, s.getArea());
    assertEquals(20, s.getPerimeter());
  }

  @Test
  public void testIsoscelesRightTriangle() {
    IsoscelesRightTriangle t = new IsoscelesRightTriangle(1);
    assertEquals(0.5, t.getArea());
    assertEquals(2 + Math.sqrt(2), t.getPerimeter());
  }

  @Test
  public void testRectangleSides() {
    assertEquals(4, new Rectangle(3, 4).numberOfSides());
  }

  @Test
  public void testSquareSides() {
    assertEquals(4, new Square(5).numberOfSides());
  }

  @Test
  public void testRightTriangleSides() {
    assertEquals(3, new RightTriangle(3, 4).numberOfSides());
  }

  @Test
  public void testIsoscelesRightTriangleSides() {
    assertEquals(3, new IsoscelesRightTriangle(1).numberOfSides());
  }
}
