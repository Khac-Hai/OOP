package com.signal;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng tín hiệu rời rạc
        DiscreteSignal discreteSignal = new DiscreteSignal(10.0, 0.02, 50.0, 5.0);
        discreteSignal.displayDiscreteSignalInfo();
        System.out.println("Value at index 1: " + discreteSignal.getValueAt(1));

        // Tạo đối tượng tín hiệu liên tục
        ContinuousSignal continuousSignal = new ContinuousSignal(15.0, 0.02, 75.0, 10.0);
        continuousSignal.displayContinuousSignalInfo();
        System.out.println("Value at t = 1.0: " + continuousSignal.getValueAt(1.0));
    }
}
