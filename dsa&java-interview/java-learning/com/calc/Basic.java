package com.calc;

public class Basic {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    // Method to use Helper
    public void useHelper() {
        Helper h = new Helper();
        h.help();  //Statements like h.help(); must be inside a method,constructor or blocks.
    }
}

// Another class (allowed, but NOT public)
class Helper {
    void help() {
        System.out.println("Helping...");
    }
}