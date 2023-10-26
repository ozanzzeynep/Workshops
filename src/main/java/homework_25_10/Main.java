package homework_25_10;

import homework_25_10.business.ProductManager;
import homework_25_10.core.logging.Logger;
import homework_25_10.dataAccess.HibernateProductDao;
import homework_25_10.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1,"IPhone Xr",10000);

        Logger[] loggers = {};
        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);


    }
}
