package com.example.solid_principles.Solved.DIP;

public class DataService {
    private Database database;

    public DataService(Database database) {
        this.database = database;
    }

    public void fetchData() {
        database.getData();
    }
}
