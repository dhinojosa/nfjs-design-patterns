package com.xyzcorp.javapatterns.proxy.database;

class RealDatabase implements Database {
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
