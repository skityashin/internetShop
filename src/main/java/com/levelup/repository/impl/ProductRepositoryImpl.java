package com.levelup.repository.impl;

import com.levelup.model.Product;
import com.levelup.repository.ProductRepository;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

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
    public Product findByTitle(String title_prod) {
        Query query = entityManager.createQuery("SELECT p FROM Product p WHERE p.title_prod = :title_prod");
        query.setParameter("title_prod", title_prod);
        List<Product> products = query.getResultList();
        if (!CollectionUtils.isEmpty(products)) {
            return products.get(0);
        }
        return null;
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
        Query query = entityManager.createQuery("FROM Product ORDER BY title_prod");
        return (List<Product>)query.getResultList();
    }

    @Override
    public List<Product> getAllProduct1() {
        Query query = entityManager.createQuery("FROM Product ORDER BY price");
        return (List<Product>)query.getResultList();
    }

    @Override
    public List<Product> getAllProduct2() {
        Query query = entityManager.createQuery("FROM Product WHERE category_id=1");
        return (List<Product>)query.getResultList();
    }

    @Override
    public List<Product> getAllProduct3() {
        Query query = entityManager.createQuery("FROM Product WHERE category_id=2");
        return (List<Product>)query.getResultList();
    }

    @Override
    public boolean isProductExist(long id_prod) {
        return entityManager.contains(id_prod);
    }

}
