// otherpackage/DifferentPackageClass.java
package otherpackage;

import mypackage.ParentClass;

public class DifferentPackageClass {
    public void attemptToCallProtectedMethod() {
        ParentClass parent = new ParentClass();
        // parent.protectedMethod(); // Compile-time error: cannot access protected method
    }
}
