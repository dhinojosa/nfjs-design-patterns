package com.xyzcorp.javapatterns.proxy.database;


public class Runner {
    public static void main(String[] args) {
        Database db = new DatabaseProxy();
        db.query("SELECT * FROM users");
    }
}
