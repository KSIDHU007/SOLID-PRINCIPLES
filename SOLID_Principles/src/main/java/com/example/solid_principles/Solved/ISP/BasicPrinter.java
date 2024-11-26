package com.example.solid_principles.Solved.ISP;

public class BasicPrinter implements Printer {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}
