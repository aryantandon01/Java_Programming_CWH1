package com.company;
import java.lang.*;
import java.util.*;

class Calculator {
    public static void findAverage(float x, float y, float z){
        float res = (x + y + z)/(3);
        System.out.printf("%.2f", res);
    }
    // Implement your code here
}

class Tester {
    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.findAverage(50,20.0f,30.0f);
        // Invoke the method findAverage of the Calculator class and display the average
    }
}