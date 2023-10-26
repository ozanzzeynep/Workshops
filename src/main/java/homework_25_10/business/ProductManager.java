package homework_25_10.business;

import homework_25_10.core.logging.Logger;
import homework_25_10.dataAccess.ProductDao;
import homework_25_10.entities.Product;

public class ProductManager {

    private ProductDao productDao;
    private Logger [] loggers;

    public ProductManager(ProductDao productDao,Logger [] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }
    public void add(Product product) throws Exception {
        //İş kuralları yazılır
        if(product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }

        productDao.add(product);
        //Listeye db daha sonra mail logu yolladık.
        for(Logger logger : loggers){
            logger.log(product.getName());
        }
    }
}
