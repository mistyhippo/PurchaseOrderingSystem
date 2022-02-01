package com.revature.daos;

import com.revature.models.Product;
import java.util.List;

public interface ProductDao {
    public void createProduct(Product p);

    public List<Product> readAllProducts();
    public List<Product> readAllProductsByBuyer(int buyerId);

    public void updateProduct(Product p);
    public void deleteProduct(Product p);



}
