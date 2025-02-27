package com.xyzcorp.javapatterns.proxy.database;

class DatabaseProxy implements Database {
    private RealDatabase realDatabase;

    public void query(String sql) {
        if (realDatabase == null) {
            realDatabase = new RealDatabase();
        }
        System.out.println("Logging query: " + sql);
        realDatabase.query(sql);
    }
}
