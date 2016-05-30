package com.levelup.service.impl;


import com.levelup.model.Category;
import com.levelup.repository.CategoryRepository;
import com.levelup.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Class {@link com.levelup.service.impl.CategoryServiceImpl}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public void saveCategory(Category category) {
        if(category == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }
        categoryRepository.saveCategory(category);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateCategory(Category category) {
        categoryRepository.updateCategory(category);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Category findById(long id_category) {
        return categoryRepository.findById(id_category);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.getAllCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteCategory(long id_category) {
        categoryRepository.deleteCategory(id_category);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCategoryExist(long id_category) {
        return categoryRepository.isCategoryExist(id_category);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Category findByTitle(String title_category) {
        return categoryRepository.findByTitle(title_category);
    }
}


