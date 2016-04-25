package com.levelup.controller;

import com.levelup.dto.CategoryDto;
import com.levelup.dto.ProductDto;
import com.levelup.model.Category;
import com.levelup.model.Product;
import com.levelup.service.CategoryService;
import com.levelup.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.List;

/**
 * Class {@link com.levelup.controller.ProductController}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 16.02.16
 */

@Controller
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public String showForm() {
        return "add_product";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public String showResult(@ModelAttribute ProductDto productDto, @ModelAttribute CategoryDto categoryDto, Model model) {
        if (productDto == null) {
            return "add_product";
        }
        Category category = categoryService.findByTitle(categoryDto.getTitle_category());

        category.setTitle_category(categoryDto.getTitle_category());
        Product product = new Product();

        product.setTitle_prod(productDto.getTitle_prod());
        product.setQuantity(productDto.getQuantity());
        product.setPrice(productDto.getPrice());
        product.setDescription(productDto.getDescription());
        product.setCategory(category);

        productService.saveProduct(product);
        model.addAttribute("title", product.getTitle_prod());
        model.addAttribute("id_prod", product.getId_prod());
        model.addAttribute("description", product.getDescription());
        model.addAttribute("price", product.getPrice());
        model.addAttribute("quantity", product.getQuantity());
        model.addAttribute("category", product.getCategory());

        return "one_product";
    }

    @RequestMapping(value = "/delete/{id_prod}", method = RequestMethod.POST)
    @ResponseBody
    @SuppressWarnings("unchecked")
    public ResponseEntity deleteProduct(@PathVariable long id_prod) {
        productService.deleteProduct(id_prod);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/find/{id_prod}", method = RequestMethod.GET)
    public String findProduct(@PathVariable long id_prod, Model model) {
        Product product = productService.findById(id_prod);
        model.addAttribute("title", product.getTitle_prod());
        model.addAttribute("price", product.getPrice());
        model.addAttribute("description", product.getDescription());
        model.addAttribute("id_prod", product.getId_prod());
        return "one_product";
    }

    //header - search
    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public String writeProduct(HttpServletRequest request, Model model) {
        String temp = request.getParameter("search");
        long id_prod = Long.parseLong(temp);
        Product product = productService.findById(id_prod);
        model.addAttribute("title", product.getTitle_prod());
        model.addAttribute("price", product.getPrice());
        model.addAttribute("description", product.getDescription());
        model.addAttribute("id_prod", product.getId_prod());
        return "one_product";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json")
    public String getAllProducts(Model model) {
        List<Product> products = productService.getAllProduct();
        model.addAttribute("products", products);
        return "all_product";
    }

    // sort по наименованию
    @RequestMapping(value = "/getAll0", method = RequestMethod.GET, produces = "application/json")
    public String getAllProducts0(Model model) {
        List<Product> products = productService.getAllProduct();
        model.addAttribute("products", products);
        return "all_product";
    }

    // sort цена по возрастанию
    @RequestMapping(value = "/getAll1", method = RequestMethod.GET, produces = "application/json")
    public String getAllProducts1(Model model) {
        List<Product> products = productService.getAllProduct1();
        model.addAttribute("products", products);
        return "all_product";
    }

    // sort цена по уменьшению
    @RequestMapping(value = "/getAll2", method = RequestMethod.GET, produces = "application/json")
    public String getAllProducts2(Model model) {
        List<Product> products = productService.getAllProduct1();
        Collections.reverse(products);
        model.addAttribute("products", products);
        return "all_product";
    }

    // sort tv
    @RequestMapping(value = "/tv", method = RequestMethod.GET, produces = "application/json")
    public String getTvProducts(Model model) {
        List<Product> products = productService.getAllProduct2();
        model.addAttribute("products", products);
        return "all_product";
    }

    // sort mob
    @RequestMapping(value = "/mob", method = RequestMethod.GET, produces = "application/json")
    public String getMobProducts(Model model) {
        List<Product> products = productService.getAllProduct3();
        model.addAttribute("products", products);
        return "all_product";
    }

}
