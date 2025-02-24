package com.greedy.polymorphism.level01.basic;

public class Triangle extends Shape implements Resizable{
    double base;
    double height;
    double side1;
    double side2;
    double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void resize(double factor) {
        base *= factor;
        height *= factor;
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }

    @Override
    double calculateArea() {
        return base * height / 2;
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
