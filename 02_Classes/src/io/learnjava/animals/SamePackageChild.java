package io.learnjava.animals;

public class SamePackageChild extends Animal {
    public void demo() {
        System.out.println("[SamePackageChild]");
        System.out.println(publicVar);      // ✅ public
        System.out.println(protectedVar);   // ✅ protected (same package)
        System.out.println(defaultVar);     // ✅ default (same package)
        // System.out.println(privateVar);  // ❌ private
        System.out.println(getPrivateVar()); // ✅ via public getter
    }
}
