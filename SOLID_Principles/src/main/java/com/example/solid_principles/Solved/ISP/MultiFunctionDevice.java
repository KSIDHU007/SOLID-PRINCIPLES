package com.example.solid_principles.Solved.ISP;

public class MultiFunctionDevice implements Printer, Scanner {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }
}
