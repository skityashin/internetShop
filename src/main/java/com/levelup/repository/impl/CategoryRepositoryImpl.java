package com.levelup.repository.impl;

import com.levelup.model.Category;
import com.levelup.repository.CategoryRepository;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

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

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveCategory(Category category) {
        if(category == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }
        entityManager.persist(category);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Category findById(long id_category) {
        return entityManager.find(Category.class, id_category);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateCategory(Category category) {
        entityManager.merge(category);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteCategory(long id_category) {
        Category removingCategory = entityManager.find(Category.class, id_category);
        entityManager.remove(removingCategory);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Category> getAllCategory() {
        Query query = entityManager.createQuery("FROM Category");
        return (List<Category>)query.getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCategoryExist(long  id_category) {
        return entityManager.contains( id_category);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Category findByTitle(String title_category) {
        Query query = entityManager.createQuery("SELECT c FROM Category c WHERE c.title_category = :title_category");
        query.setParameter("title_category", title_category);
        List<Category> category = query.getResultList();
        if (!CollectionUtils.isEmpty(category)) {
            return category.get(0);
        }
        return null;
    }
}
