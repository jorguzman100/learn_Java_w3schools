package io.learnjava.classes;

// ✅ abstract class: cannot be instantiated directly (you can't do new Shape();)
// 🔄 Meant to be extended and implemented by subclasses
abstract class Shape {

    // ✅ protected: accessible in same package or from subclasses
    protected int sides;

    // ✅ public: subclasses must implement this method and it will be accessible to anyone
    // ✅ abstract: no body — must be implemented in a subclass
    public abstract void draw();
}