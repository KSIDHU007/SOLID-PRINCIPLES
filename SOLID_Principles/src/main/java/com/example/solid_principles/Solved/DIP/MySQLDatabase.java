package com.example.solid_principles.Solved.DIP;

public class MySQLDatabase implements Database {
    @Override
    public void getData() {
        System.out.println("Fetching data from MySQL database");
    }
}
