package com.levelup.controller;

import com.levelup.dto.ProductDto;
import com.levelup.model.Product;
import com.levelup.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
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

    @RequestMapping(method = RequestMethod.GET, value =  "/add")
    public String showForm(){
        return "add_product";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public String showResult(@ModelAttribute ProductDto productDto, Model model){
        if(productDto == null) {
            return "add_product";
        }
        Product product = new Product();
        product.setTitle_prod(productDto.getTitle_prod());
        product.setQuantity(productDto.getQuantity());
        product.setPrice(productDto.getPrice());
        productService.saveProduct(product);
        model.addAttribute("title", product.getTitle_prod());
        model.addAttribute("price", product.getPrice());
        model.addAttribute("description", product.getDescription());
        return "one_product";
    }



    @RequestMapping(value = "/delete/{id_prod}", method = RequestMethod.POST)
    @ResponseBody
    @SuppressWarnings("unchecked")
    public ResponseEntity deleteProduct(@PathVariable long id_prod) {
        productService.deleteProduct(id_prod);
        return  new ResponseEntity(HttpStatus.OK);
    }


    @RequestMapping(value = "/find/{id_prod}", method = RequestMethod.GET)
    public String findProduct(@PathVariable long id_prod, Model model) {
        Product product = productService.findById(id_prod);
        model.addAttribute("title", product.getTitle_prod());
        model.addAttribute("price", product.getPrice());
        model.addAttribute("description", product.getDescription());
        return "one_product";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public String getAllProducts(Model model) {
        List<Product> products = productService.getAllProduct();
            model.addAttribute("products", products);
        return "all_product";
    }

}
