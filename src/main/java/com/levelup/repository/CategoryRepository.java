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
    public void saveCategory (Category category);
    public Category findById (long id_category);
    public void updateCategory (Category category);
    public void deleteCategory (long id_category);
    public List<Category> getAllCategory ();
    public boolean isCategoryExist(long id_category);
}
