package com.epam.se01.memory;

public class Example7 {

    public static void main(String[] args) {
        double val1 = 5.5;
        double val2 = 4.5;
        double val3 = val1 + val2;
        double val4 = 10;

        double eps = 0.000001;
        System.out.println(Math.abs(val3 - val4) < eps);
    }
}
