package org.example.workshop27_10.dataAccess;

import org.example.workshop27_10.entities.Car;

public class JdbcCarDao implements CarDao {

    @Override
    public void add(Car car) {
        System.out.println("Araba jdbc ile eklendi.");
    }
}
