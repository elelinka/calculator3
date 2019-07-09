package com.google;

public class Main {

    public static void main(String[] args) {
        Calculator calc1 = new Calculator();

        System.out.println(calc1.isEven(50));
        System.out.println(calc1.isOdd(50));
        System.out.println("Pole koła: " + calc1.circleField(2));
        System.out.println("Liczba podniesiona do kwadratu: " + calc1.power(6));

    }
}
