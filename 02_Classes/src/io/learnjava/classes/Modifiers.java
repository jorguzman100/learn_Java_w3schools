package io.learnjava.classes;

public class Modifiers {
    // ✅ public: accessible from anywhere
    // ✅ static: belongs to the class, not an instance (call with Example.VERSION)
    // ✅ final: cannot be changed after initialization (a constant)
    public static final int VERSION = 1;

    // ✅ protected: accessible only within the same package or subclasses (even from other packages)
    // 🧩 instance field — each object has its own copy
    protected String name;

    // ✅ default (package-private): accessible only to classes in the same package
    int internalCode;

    // ✅ private: accessible only within this class (nowhere else, not even subclasses)
    // private String password;

    // ✅ transient: this field will NOT be serialized when the object is saved to a stream
    // 🧩 useful for temporary, sensitive, or runtime-only data
    // private transient String sessionToken;

    // ✅ volatile: ensures that all threads see the most up-to-date value immediately
    // 🧩 important in multi-threaded programs for shared variables
    // private volatile boolean running = true;

    // ✅ public: this method can be called from anywhere in the program
    // 🧩 instance method — requires an object to call: example.greet();
    public void greet() {
        System.out.println("Hello " + name);
    }

    // ✅ protected: visible in the same package and in subclasses
    // 🔄 typically used to allow customization in subclasses
    protected void validate() {
        System.out.println("Validating...");
    }

    // ✅ default (package-private): only accessible from other classes in the same package
    // 🔒 useful for internal helper methods
    void log() {
        System.out.println("Logging");
    }

    // ✅ private: only accessible within this class
    // 🔐 used to hide sensitive or internal operations
    // private void encrypt() {
    //     System.out.println("Encrypting...");
    // }

    // ✅ public: accessible from anywhere
    // ✅ static: can be called without creating an object (e.g., Example.about())
    public static void about() {
        System.out.println("Version: " + VERSION);
    }

    // ✅ public: accessible anywhere
    // ✅ final: this method cannot be overridden by any subclass
    public final void show() {
        System.out.println("Fixed behavior");
    }

    // ✅ synchronized: only one thread can run this method on a given object at a time
    // 🔄 ensures thread safety for operations that modify shared state
    public synchronized void deposit(double amount) {
        System.out.println("Depositing: " + amount);
        // logic for depositing money
    }

    // ✅ synchronized + static: only one thread can run this method for the entire class at a time
    public static synchronized void globalLockOperation() {
        System.out.println("Global synchronized operation");
    }
}
