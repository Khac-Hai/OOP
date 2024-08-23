public class Assignment1 {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();

        n1.i = 2;
        n2.i = 5;

        // Using the value of n1.i before it gets overwritten
        System.out.println("Value of n1.i before assignment: " + n1.i);

        n1.i = n2.i;
        n2.i = 10;

        // Using the value of n1.i and n2.i after changes
        System.out.println("Value of n1.i after assignment: " + n1.i);
        System.out.println("Value of n2.i after assignment: " + n2.i);
    }
}

