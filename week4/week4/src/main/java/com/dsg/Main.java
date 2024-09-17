package com.dsg;

public class Main {
    public static void main(String[] args) {
        // Tạo cây biểu thức: (5 + 3) * 2
        OperandNode five = new OperandNode(5);
        OperandNode three = new OperandNode(3);
        OperandNode two = new OperandNode(2);

        OperatorNode plus = new OperatorNode("+");
        plus.setChild(0, five);
        plus.setChild(1, three);

        OperatorNode multiply = new OperatorNode("*");
        multiply.setChild(0, plus);
        multiply.setChild(1, two);

        System.out.println("Biểu thức: " + multiply.toString());
        System.out.println("Kết quả: " + multiply.eval());
    }
}
