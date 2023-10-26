package homework_25_10.dataAccess;

public class HibernateProductDao implements ProductDao{

    public void add(Product product) {
        //Sadece db erişim kodları buraya yazılır.
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
