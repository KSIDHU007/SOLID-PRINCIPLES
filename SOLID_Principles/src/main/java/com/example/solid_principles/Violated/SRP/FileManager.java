package com.example.solid_principles.Violated.SRP;

public class FileManager {
    public void readFile(String filePath) {
        System.out.println("Reading file: " + filePath);
    }

    public void writeFile(String filePath, String content) {
        System.out.println("Writing to file: " + filePath);
    }
}
