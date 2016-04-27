package com.levelup.repository;

import com.levelup.model.Product;
import java.util.List;

/**
 * Class {@link com.levelup.repository.ProductRepository}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */
public interface ProductRepository {
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
