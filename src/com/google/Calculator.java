package com.google;

public class Calculator {

    public final double PI = 3.14;

    public boolean isEven(int var) {
        boolean result = var % 2 == 0 ? true : false;

        return result;
    }

    public boolean isOdd(int var) {
        boolean result = var % 2 != 0 ? true : false;

        return result;
    }

    public double circleField(double radius) {
        double result = PI * (radius * radius);

        return result;
    }

    public int power(int var) {
        // int result = var * var;
        // krótszy zapis
        return var * var; //result;
    }
}
