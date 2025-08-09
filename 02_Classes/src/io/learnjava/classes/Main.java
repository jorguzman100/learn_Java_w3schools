package io.learnjava.classes;

public class Main {
    public static void main(String[] args) {
        // Class - Classes
        Classes myObj1 = new Classes("Jorge");
        Classes myObj2 = new Classes("Alex");
        int times = 2;

        System.out.printf("x = %d%n", myObj1.x);
        myObj1.x = 39;
        System.out.printf("x = %d%n", myObj1.x);
        System.out.printf("x = %f%n", myObj1.PI);
        System.out.printf("%d times PI = %f%n", times, myObj2.timesPI(times));

        // Public vs Static
        myStaticMethod();
        Main mainObj = new Main();
        mainObj.myPublicMethod();
        myObj1.greetPublic();
        myObj2.greetPublic();

        // Class - Cars
        Cars carObj1 = new Cars("Civic");
        Cars carObj2 = new Cars(2025, "BYD");
        System.out.printf("My car is a %2$s model year %1$d!%n", carObj1.modelYear, carObj1.modelName);
        System.out.printf("My car is a %2$s model year %1$d!%n", carObj2.modelYear, carObj2.modelName);

        // ==============================
        // 1. Create Modifiers object
        // ==============================
        Modifiers example = new Modifiers();

        // Fields
        System.out.println("VERSION: " + Modifiers.VERSION); // ✅ public static final
        example.name = "Test Name";                           // ✅ protected: accessible in same package
        example.internalCode = 123;                           // ✅ default/package-private: accessible in same package
        // example.password = "1234";                         // ❌ private
        // example.sessionToken = "token";                    // ❌ private (even though transient)
        // example.running = false;                           // ❌ private (even though volatile)

        // ==============================
        // 2. Call methods
        // ==============================
        example.greet();             // ✅ public
        example.validate();          // ✅ protected: accessible in same package
        example.log();               // ✅ default/package-private: accessible in same package
        // example.encrypt();         // ❌ private
        Modifiers.about();           // ✅ public static
        example.show();              // ✅ public final
        example.deposit(200.0);      // ✅ public synchronized
        Modifiers.globalLockOperation(); // ✅ public static synchronized

        // ==============================
        // 3. Work with Shape (abstract class)
        // ==============================
        Square square = new Square(4);
        square.draw(); // ✅ Calls subclass implementation

    }

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
}
