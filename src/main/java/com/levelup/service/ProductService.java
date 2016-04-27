package com.levelup.service;

import com.levelup.model.Product;
import java.util.List;

/**
 * Class {@link com.levelup.service.ProductService}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

public interface ProductService {

    void saveProduct (Product product);
    Product findById (long id_prod);
    Product findByTitle (String title_prod);
    void updateProduct (Product product);
    void deleteProduct (long id_prod);
    List<Product> getAllProduct ();
    List<Product> getAllProduct1 ();
    List<Product> getAllProduct2 ();
    List<Product> getAllProduct3 ();
    boolean isProductExist(long id_prod);
}
