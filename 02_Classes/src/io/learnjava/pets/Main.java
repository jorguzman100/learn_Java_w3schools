package io.learnjava.pets;

import io.learnjava.animals.Animal;
import io.learnjava.animals.SamePackageChild;

public class Main {
    public static void main(String[] args) {
        // Same package + subclass
        new SamePackageChild().demo();

        // Other package + subclass
        new OtherPackageChild().demo();

        // Other package + non-subclass
        new OtherPackageNonChild().demo();

        // Bonus: same package (non-subclass) behavior via imports
        System.out.println("[Direct access from pets.Main]");
        Animal a = new Animal();
        System.out.println(a.publicVar);      // ✅
        // System.out.println(a.protectedVar); // ❌ (not a subclass here)
        // System.out.println(a.defaultVar);   // ❌
        // System.out.println(a.privateVar);   // ❌
        System.out.println(a.getPrivateVar()); // ✅
    }
}
