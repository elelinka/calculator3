package com.google;

public class Calculator {

    public final double pi = 3.14;

    public boolean isEven(int variable) {
        return variable % 2 == 0;
    }

    public boolean isOdd(int variable) {
        return !isEven(variable);
    }

    public double circleField(double radius) {
        return pi * (radius * radius);
    }

    public int power(int variable) {
        return variable * variable;
    }
}
