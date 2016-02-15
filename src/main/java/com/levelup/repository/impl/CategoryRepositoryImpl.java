package com.levelup.repository.impl;

import com.levelup.model.Category;
import com.levelup.repository.CategoryRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Class {@link com.levelup.repository.impl.CategoryRepositoryImpl}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

@Repository
@Transactional
public class CategoryRepositoryImpl implements CategoryRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveCategory(Category category) {
        if(category == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }
        entityManager.persist(category);
    }

    @Override
    public Category findById(long id_category) {
        return entityManager.find(Category.class, id_category);
    }

    @Override
    public void updateCategory(Category category) {
        entityManager.merge(category);
    }

    @Override
    public void deleteCategory(long id_category) {
        entityManager.remove(id_category);
    }

    @Override
    public List<Category> getAllCategory() {
        Query query = entityManager.createQuery("FROM Category");
        return (List<Category>)query.getResultList();
    }

    @Override
    public boolean isCategoryExist(long  id_category) {
        return entityManager.contains( id_category);
    }


}
