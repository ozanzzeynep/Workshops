package org.example.workshop27_10;

import org.example.workshop27_10.business.CarManager;
import org.example.workshop27_10.core.logging.Logger;
import org.example.workshop27_10.dataAccess.HibernateCarDao;
import org.example.workshop27_10.entities.Car;

public class Main {
    public static void main(String[] args) throws Exception {


        Car car1 = new Car(1,"Toyota","X-124",2022,50000);
        Logger [] loggers = {};
        CarManager manager = new CarManager(new HibernateCarDao(),loggers);
        manager.add(car1);

        

    }
}
