public class PassObject {
    static void f(Number m) {
        m.i = 15;
    }
    public static void main(String[] args) {
        Number n = new Number();
        n.i = 14;
        f(n);

        // Display the value of n.i after the method call
        System.out.println("Value of n.i after calling f: " + n.i);
    }
}

class Number {
    public int i;
}
