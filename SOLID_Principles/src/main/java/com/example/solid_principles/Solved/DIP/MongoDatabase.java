package com.example.solid_principles.Solved.DIP;

public class MongoDatabase implements Database {
    @Override
    public void getData() {
        System.out.println("Fetching data from MongoDB database");
    }
}
