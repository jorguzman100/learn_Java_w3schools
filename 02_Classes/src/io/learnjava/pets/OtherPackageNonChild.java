package io.learnjava.pets;

import io.learnjava.animals.Animal;

public class OtherPackageNonChild {
    public void demo() {
        System.out.println("[OtherPackageNonChild]");
        Animal a = new Animal();
        System.out.println(a.publicVar);     // ✅ public
        // System.out.println(a.protectedVar); // ❌ protected (not a subclass)
        // System.out.println(a.defaultVar);   // ❌ default
        // System.out.println(a.privateVar);   // ❌ private
        System.out.println(a.getPrivateVar()); // ✅ via public getter
    }
}
