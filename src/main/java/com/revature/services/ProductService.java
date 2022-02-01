package com.revature.services;

import com.revature.daos.ProductDao;
import com.revature.daos.PersonDao;
import com.revature.models.Product;
import com.revature.models.Person;
//import com.revature.util.LoggingSingleton;


import java.util.List;

public class ProductService {

    private ProductDao prod;
    private PersonDao pd;

    public ProductService(ProductDao prod, PersonDao pd){
        this.prod = prod;
        this.pd = pd;
    }

    public Product createNewProduct(int id, String prodName, float price, List<Person> s){
        Product pr = new Product();
        pr.setProductId(id);
        pr.setProductName(prodName);
        pr.setPrice(price);
        pr.setSellers(s);
        prod.createProduct(pr);
        //LoggingSingleton.logger.info("New Item created: " + pr.toString());
        return pr;
    }

  /*  public List<Product> getAllProducts(){

        List<Product> pList = prod.readAllProducts();

        pList.forEach(product -> );
    }
*/






}
