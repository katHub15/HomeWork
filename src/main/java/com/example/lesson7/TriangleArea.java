package com.example.lesson7;

public class TriangleArea {
    public double calculate(double base, double height) {
        if (base < 0 || height < 0) {
            throw new IllegalArgumentException("Base or height cannot be negative");
        }
        return 0.5 * base * height;
    }
}
