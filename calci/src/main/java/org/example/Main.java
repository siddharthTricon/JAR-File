package org.example;

import org.example.add.classadd;
import org.example.divide.classdivide;
import org.example.mult.classmult;
import org.example.sub.classsub;

public class Main {
    public static void main(String[] args) {
        classadd add = new classadd();
        classsub sub = new classsub();
        classmult mult = new classmult();
        classdivide div = new classdivide();
//

        int a = 56;
        int b = 9;

        System.out.println("Addition: " + add.add(a, b));
        System.out.println("Subtraction: " + sub.subtraction(a, b));
        System.out.println("Multiplication: " + mult.multiply(a, b));
        System.out.println("Division: " + div.divide(a, b));
    }
}