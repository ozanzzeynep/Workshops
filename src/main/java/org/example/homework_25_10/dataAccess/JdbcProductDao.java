package org.example.homework_25_10.dataAccess;

import org.example.homework_25_10.entities.Product;

public class JdbcProductDao implements ProductDao{

    public void add(Product product) {
        //Sadece db erişim kodları buraya yazılır.SQL
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
