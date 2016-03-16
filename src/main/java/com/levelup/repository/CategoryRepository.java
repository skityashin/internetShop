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
    void saveCategory (Category category);
    Category findById (long id_category);
    void updateCategory (Category category);
    void deleteCategory (long id_category);
    List<Category> getAllCategory ();
    boolean isCategoryExist(long id_category);
}
