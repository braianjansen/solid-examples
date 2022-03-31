package br.com.braian.ocp.example_refactored;

import java.util.List;

public class ShapeAreaCalculator
{
    public void calculate(List<Shape> shapes)
    {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        System.out.println("total area = " + area);
    }
}
