package com.greedy.polymorphism.level01.basic;

public class Circle extends Shape implements Resizable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}
