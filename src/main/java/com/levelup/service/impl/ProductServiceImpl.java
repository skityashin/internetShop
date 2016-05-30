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

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveProduct(Product product) {
        if(product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        productRepository.saveProduct(product);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateProduct(Product product) {
        productRepository.updateProduct(product);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product findById(long id_prod) {
        return productRepository.findById(id_prod);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Product findByTitle(String title_prod) {
        return productRepository.findByTitle(title_prod);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Product> getAllProduct() {
        return productRepository.getAllProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Product> getAllProduct1() {
        return productRepository.getAllProduct1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Product> getAllProduct2() {
        return productRepository.getAllProduct2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Product> getAllProduct3() {
        return productRepository.getAllProduct3();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteProduct(long id_prod) {
        productRepository.deleteProduct(id_prod);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isProductExist(long id_prod) {
        return productRepository.isProductExist(id_prod);
    }

}
