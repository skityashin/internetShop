package com.levelup.controller;

import com.levelup.dto.CategoryDto;
import com.levelup.model.Category;
import com.levelup.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Class {@link com.levelup.controller.CategoryController}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 17.02.16
 */

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity createCategory(@RequestBody CategoryDto categoryDto) {
        if(categoryDto == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        Category category = new Category();
        category.setTitle_category(categoryDto.getTitle_category());
        categoryService.saveCategory(category);
        return new ResponseEntity(category, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id_category}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity deleteCategory(@PathVariable long id_category) {
        categoryService.deleteCategory(id_category);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/find/{id_category}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity findCategory(@PathVariable long id_category) {
        Category category = categoryService.findById(id_category);
        if (category == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(category, HttpStatus.OK);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity getAllProducts() {
        List<Category> categorys = categoryService.getAllCategory();
        if (CollectionUtils.isEmpty(categorys)) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(categorys, HttpStatus.OK);
    }


}
