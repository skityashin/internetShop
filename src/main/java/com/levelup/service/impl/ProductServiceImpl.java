package com.levelup.service.impl;

import com.levelup.model.Product;
import com.levelup.repository.ProductRepository;
import com.levelup.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Class {@link com.levelup.service.impl.ProductServiceImpl}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void saveProduct(Product product) {
        if(product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        productRepository.saveProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.updateProduct(product);
    }

    @Override
    public Product findById(long id_prod) {
        return productRepository.findById(id_prod);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }

    @Override
    public void deleteProduct(long id_prod) {
        productRepository.deleteProduct(id_prod);
    }

    @Override
    public boolean isProductExist(long id_prod) {
        return productRepository.isProductExist(id_prod);
    }

}
