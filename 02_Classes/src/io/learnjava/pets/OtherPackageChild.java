package io.learnjava.pets;

import io.learnjava.animals.Animal;

public class OtherPackageChild extends Animal {
    public void demo() {
        System.out.println("[OtherPackageChild]");
        System.out.println(publicVar);      // ✅ public
        System.out.println(protectedVar);   // ✅ protected (via inheritance in other package)
        // System.out.println(defaultVar);  // ❌ default (different package)
        // System.out.println(privateVar);  // ❌ private

        Animal a = new Animal();
        // System.out.println(a.protectedVar); // ❌ nuance: cannot use protected via another instance
        System.out.println(getPrivateVar());   // ✅ via public getter
    }
}
