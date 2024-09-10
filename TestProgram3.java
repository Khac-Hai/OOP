// TestProgram.java

import mypackage.SamePackageClass;
import otherpackage.DifferentPackageClass;
import otherpackage.SubClass;

public class TestProgram3 {
    public static void main(String[] args) {
        // Same package access
        SamePackageClass samePackage = new SamePackageClass();
        samePackage.callProtectedMethod(); // Should print "Protected method in ParentClass"

        // Different package without inheritance
        DifferentPackageClass differentPackage = new DifferentPackageClass();
        // differentPackage.attemptToCallProtectedMethod(); // Uncommenting this line causes a compile-time error

        // Different package with inheritance
        SubClass subClass = new SubClass();
        subClass.callProtectedMethod(); // Should print "Protected method in ParentClass"
    }
}
