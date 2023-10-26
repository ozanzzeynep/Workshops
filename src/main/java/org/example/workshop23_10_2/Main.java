package org.example.workshop23_10_2;

public class Main {
    public static void main(String[] args) {


        String mesaj = "Vade oranı";
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("image1.jpg");

        //System.out.println(product1.name);

        Product product2 = new Product();
        product1.setName("Smeg Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("image1.jpg");


        Product product3 = new Product();
        product1.setName("Kitchen Air Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("image1.jpg");

        Product [] products = {product1,product2,product3};
        for(Product product : products){
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("123456");
        individualCustomer.setCustomerNumber("9800000000");
        individualCustomer.setFirstName("zeynep");
        individualCustomer.setLastName("ozan");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("bil.com");
        corporateCustomer.setPhone("3445435334");
        corporateCustomer.setTaxNumber("222222222");
        corporateCustomer.setCustomerNumber("64463");

        Customer [] customers = {individualCustomer,corporateCustomer};
    }
}
