package io.learnjava.classes;

// Subclass of Shape so we can implement draw()
class Square extends Shape {
    public Square(int sides) {
        this.sides = sides; // ✅ protected field accessible in subclass (same package)
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with " + sides + " sides.");
    }
}
