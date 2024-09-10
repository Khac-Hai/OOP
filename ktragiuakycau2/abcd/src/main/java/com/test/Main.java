package com.test;

public class Main {
    public static void main(String[] args) {
        DiscreteSignal discreteSignal = new DiscreteSignal();
        ContinuousSignal continuousSignal = new ContinuousSignal();
        Radar radar = new Radar();

        // Process signals
        discreteSignal.processSignal();
        continuousSignal.processSignal();

        // Analyze signals using Radar
        int n = 4;
        System.out.println("Discrete Signal analysis at n = " + n + ": " + radar.analyzeDiscreteSignal(n));
    }
}
