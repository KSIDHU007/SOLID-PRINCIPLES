package com.example.solid_principles.Violated.DIP;

public class DataService {
    private MySQLDatabase database;

    public DataService() {
        this.database = new MySQLDatabase();
    }

    public void fetchData() {
        database.getData();
    }
}

class MySQLDatabase {
    public void getData() {
        System.out.println("Fetching data from MySQL database");
    }
}
