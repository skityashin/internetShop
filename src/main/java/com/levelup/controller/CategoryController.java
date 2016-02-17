package com.levelup.controller;

import com.levelup.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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



}
