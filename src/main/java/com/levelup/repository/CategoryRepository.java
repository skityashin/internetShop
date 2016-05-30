package com.levelup.repository;

import com.levelup.model.Category;

import java.util.List;

/**
 * Class {@link com.levelup.repository.CategoryRepository}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */


public interface CategoryRepository {

    /**
     * Persists new entity
     *
     * @param category
     */
    void saveCategory(Category category);

    Category findById(long id_category);

    Category findByTitle(String title_category);

    /**
     * Updates new entity
     *
     * @param category
     */
    void updateCategory(Category category);

    void deleteCategory(long id_category);

    /**
     * @return list with every {@link Category} entity, persisted in database
     */
    List<Category> getAllCategory();

    boolean isCategoryExist(long id_category);
}
