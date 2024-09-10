package com.test;

public class Radar {

    // Method to analyze discrete signals
    public double analyzeDiscreteSignal(int n) {
        if (n >= 0 && n <= 15) {
            return 1 - (n / 15.0);
        }
        return 0.0;
    }

    // Main method for testing
    public static void main(String[] args) {
        Radar radar = new Radar();
        int n = 4;
        double result = radar.analyzeDiscreteSignal(n);
        System.out.println("Discrete signal value for n = " + n + " is: " + result);
    }
}

