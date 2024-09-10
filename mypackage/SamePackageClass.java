// mypackage/SamePackageClass.java
package mypackage;

public class SamePackageClass {
    public void callProtectedMethod() {
        ParentClass parent = new ParentClass();
        parent.protectedMethod(); // Accessible because it's in the same package
    }
}
