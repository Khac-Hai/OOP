// otherpackage/SubClass.java
package otherpackage;

import mypackage.ParentClass;

public class SubClass extends ParentClass {
    public void callProtectedMethod() {
        protectedMethod(); // Accessible because of inheritance
    }
}
