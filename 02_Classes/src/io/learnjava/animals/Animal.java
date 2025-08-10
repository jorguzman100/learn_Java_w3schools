package io.learnjava.animals;

public class Animal {
    // fields
    public    String publicVar    = "public";
    protected String protectedVar = "protected";
    String defaultVar   = "default (package-private)";
    private   String privateVar   = "private";

    // methods
    public    void publicMethod()    {}
    protected void protectedMethod() {}
    void defaultMethod()   {}
    private   void privateMethod()   {}

    // way to read private things from outside
    public String getPrivateVar() { return privateVar; }
}
