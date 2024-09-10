package com.test;

public class DiscreteSignal implements Signal {
    
    // Method to calculate δ(n - k)
    public double deltaFunction(int n, int k) {
        return (n == k) ? 1.0 : 0.0;
    }

    // Method to calculate x(n) based on the formula provided
    public double calculateSignal(int n, int[] x) {
        double result = 0.0;
        for (int k = 0; k < x.length; k++) {
            result += x[k] * deltaFunction(n, k);
        }
        return result;
    }

    @Override
    public void processSignal() {
        // Example process implementation
        System.out.println("Processing discrete signal.");
    }
}
