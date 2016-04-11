package com.levelup.service;

import com.levelup.model.Category;

import java.util.List;

/**
 * Class {@link com.levelup.service.CategoryService}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

public interface CategoryService {
    void saveCategory (Category category);
    Category findById (long id_category);
    void updateCategory (Category category);
    void deleteCategory (long id_category);
    Category findByTitle (String title_category);
    List<Category> getAllCategory ();
    boolean isCategoryExist(long id_category);
}
