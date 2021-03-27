package com.java;

public class OpenClosedPrinciple {
    public static void main(String[] args) {
   AreaCalculator area = new AreaCalculator();
   Rectangle rect = new Rectangle();
   rect.setLength(10);
   rect.setWidth(10);
        System.out.println("Area of rectangle :"+ area.calculateShapeArea(rect));
        Circle circle = new Circle();
       circle.radius=7;
        System.out.println("Area of circle :"+ area.calculateShapeArea(circle));
    }
}

class AreaCalculator{
    public double calculateShapeArea(Shape shape){
        return shape.calculateArea();
    }
}

class Circle implements Shape{
    public  double radius;

    public double calculateArea(){
        return (22/7)*radius*radius;
    }
}

interface Shape{
    double calculateArea();
}

class Rectangle implements Shape{
    public double length;
    public double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}
