package com.example.solid_principles.Solved.DIP;

public class Main {
    public static void main(String[] args) {
        Database mySQLDatabase = new MySQLDatabase();
        Database mongoDatabase = new MongoDatabase();

        DataService dataService = new DataService(mySQLDatabase);
        dataService.fetchData();

        dataService = new DataService(mongoDatabase);
        dataService.fetchData();
    }
}
