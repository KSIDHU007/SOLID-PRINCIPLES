package com.example.solid_principles.Solved.SRP;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        FileWriter fileWriter = new FileWriter();

        fileReader.readFile("example.txt");
        fileWriter.writeFile("example.txt", "Sample content");
    }
}
