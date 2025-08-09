package io.learnjava.classes;

public class Cars {
    // Class Attributes
    int modelYear;
    String modelName;

    // Constructor - 2 parameters
    public Cars(int modelYear, String modelName) {
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    // Constructor - 1 parameter
    public Cars(String modelName) {
        this(2020, modelName);
    }
}
