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

    public void saveProduct (Product product);
    public Product findById (long id_prod);
    public void updateProduct (Product product);
    public void deleteProduct (long id_prod);
    public List<Product> getAllProduct ();
    public boolean isProductExist(long id_prod);
}
