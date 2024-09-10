package com.signal;

public class ContinuousSignal implements Signal {
    private double amplitude;
    private double period;
    private double frequency;
    private double wavelength;

    public ContinuousSignal(double amplitude, double period, double frequency, double wavelength) {
        this.amplitude = amplitude;
        this.period = period;
        this.frequency = frequency;
        this.wavelength = wavelength;
    }

    @Override
    public double getAmplitude() {
        return amplitude;
    }

    @Override
    public double getPeriod() {
        return period;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    @Override
    public double getWavelength() {
        return wavelength;
    }

    // Phương thức để lấy giá trị tín hiệu tại thời điểm t
    @Override
    public double getValueAt(double t) {
        // Tính toán ví dụ cho giá trị tín hiệu liên tục tại thời điểm t
        return amplitude * Math.sin(2 * Math.PI * frequency * t);
    }

    @Override
    public double getValueAt(int index) {
        throw new UnsupportedOperationException("ContinuousSignal does not support getValueAt(int index)");
    }

    public void displayContinuousSignalInfo() {
        System.out.println("Continuous Signal - Amplitude: " + amplitude + ", Period: " + period + ", Frequency: " + frequency + ", Wavelength: " + wavelength);
    }
}

