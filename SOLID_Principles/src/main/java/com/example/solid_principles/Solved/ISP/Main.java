package com.example.solid_principles.Solved.ISP;

public class Main {
    public static void main(String[] args) {
        Printer printer = new BasicPrinter();
        printer.print("Sample document");

        MultiFunctionDevice mfd = new MultiFunctionDevice();
        mfd.print("Another document");
        mfd.scan("Scanning this document");
    }
}
