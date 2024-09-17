package com.dsg;

public interface Node {
    void setChild(int position, Node n);
    double eval();
    String toString();
}
// Lớp OperandNode lưu giá trị số học
class OperandNode implements Node {
    private double value;

    public OperandNode(double value) {
        this.value = value;
    }

    @Override
    public void setChild(int position, Node n) {
        // Không làm gì vì OperandNode không có nút con
        throw new UnsupportedOperationException("OperandNode không thể có nút con.");
    }

    @Override
    public double eval() {
        return value; // Trả về giá trị của toán hạng
    }

    @Override
    public String toString() {
        return Double.toString(value); // Trả về chuỗi biểu diễn của giá trị
    }
}

// Lớp OperatorNode lưu toán tử (như cộng, trừ) và hai toán hạng (con)
class OperatorNode implements Node {
    private String operator;
    private Node leftChild, rightChild;

    public OperatorNode(String operator) {
        this.operator = operator;
    }

    @Override
    public void setChild(int position, Node n) {
        if (position == 0) {
            leftChild = n;
        } else if (position == 1) {
            rightChild = n;
        } else {
            throw new IllegalArgumentException("Chỉ hỗ trợ hai nút con.");
        }
    }

    @Override
    public double eval() {
        switch (operator) {
            case "+":
                return leftChild.eval() + rightChild.eval();
            case "-":
                return leftChild.eval() - rightChild.eval();
            case "*":
                return leftChild.eval() * rightChild.eval();
            case "/":
                return leftChild.eval() / rightChild.eval();
            default:
                throw new UnsupportedOperationException("Toán tử không hợp lệ.");
        }
    }

    @Override
    public String toString() {
        return "(" + leftChild.toString() + " " + operator + " " + rightChild.toString() + ")";
    }
}
