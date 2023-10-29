package org.example.homework_25_10.dataAccess;

import org.example.homework_25_10.entities.Product;

public class HibernateProductDao implements ProductDao{

    public void add(Product product) {
        //Sadece db erişim kodları buraya yazılır.
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
