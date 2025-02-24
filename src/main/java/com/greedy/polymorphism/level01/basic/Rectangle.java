package com.greedy.polymorphism.level01.basic;

public class Rectangle extends Shape implements Resizable{
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double factor) {
        width = factor * width;
        height = factor * height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}
