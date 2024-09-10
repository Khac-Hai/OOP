package com.signal;

public interface Signal {
    // Các phương thức chung cho cả hai loại tín hiệu
    double getAmplitude();
    double getPeriod();
    double getFrequency();
    double getWavelength();

    // Phương thức để lấy giá trị tín hiệu tại thời điểm t (dành cho tín hiệu liên tục)
    double getValueAt(double t);

    // Phương thức để lấy giá trị tín hiệu tại chỉ số index (dành cho tín hiệu rời rạc)
    double getValueAt(int index);
}

