package com.signal;

public class DiscreteSignal implements Signal {
    private double amplitude;
    private double period;
    private double frequency;
    private double wavelength;

    public DiscreteSignal(double amplitude, double period, double frequency, double wavelength) {
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

    // Phương thức để lấy giá trị tín hiệu tại chỉ số index
    @Override
    public double getValueAt(int index) {
        // Tính toán ví dụ cho giá trị tín hiệu rời rạc tại chỉ số index
        return amplitude * Math.sin(2 * Math.PI * frequency * index * period);
    }

    @Override
    public double getValueAt(double t) {
        throw new UnsupportedOperationException("DiscreteSignal does not support getValueAt(double t)");
    }

    public void displayDiscreteSignalInfo() {
        System.out.println("Discrete Signal - Amplitude: " + amplitude + ", Period: " + period + ", Frequency: " + frequency + ", Wavelength: " + wavelength);
    }
}
