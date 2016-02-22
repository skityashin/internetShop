package com.levelup.repository.impl;

import com.levelup.model.Product;
import com.levelup.repository.ProductRepository;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Class {@link com.levelup.repository.impl.ProductRepositoryImpl}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

@Repository
@Transactional
public class ProductRepositoryImpl implements ProductRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveProduct(Product product) {
        if(product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        entityManager.persist(product);
    }

    @Override
    public Product findById(long id_prod) {
        return entityManager.find(Product.class, id_prod);
    }

    @Override
    public void updateProduct(Product product) {
        entityManager.merge(product);
    }

    @Override
    public void deleteProduct(long id_prod) {
        Product removingProduct = entityManager.find(Product.class, id_prod);
        entityManager.remove(removingProduct);
    }

    @Override
    public List<Product> getAllProduct() {
        Query query = entityManager.createQuery("FROM Product");
        return (List<Product>)query.getResultList();
    }

    @Override
    public boolean isProductExist(long id_prod) {
        return entityManager.contains(id_prod);
    }

}
