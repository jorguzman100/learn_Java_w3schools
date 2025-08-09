package io.learnjava.classes;

public class Classes {
    int x;
    final double PI;
    String name;

    // Constructor
    public Classes(String name) {
        x = 5;
        PI = 3.14159;
        this.name = name;
    }

    public double timesPI(int y) {
        return y * PI;
    }

    public void greetPublic() {
        System.out.printf("Hi %s!! - From Classes - Public%n", this.name);
    }
}
