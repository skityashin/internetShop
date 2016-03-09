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

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity createProduct(@RequestBody ProductDto productDto) {
        if(productDto == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        Product product = new Product();
        product.setTitle_prod(productDto.getTitle_prod());
        product.setQuantity(productDto.getQuantity());
        product.setPrice(productDto.getPrice());
        productService.saveProduct(product);
        return new ResponseEntity(product, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id_prod}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity deleteProduct(@PathVariable long id_prod) {
        productService.deleteProduct(id_prod);
        return new ResponseEntity(HttpStatus.OK);
    }

//    @RequestMapping(value = "/find/{id_prod}", method = RequestMethod.GET)
//    @ResponseBody
//    public ResponseEntity findProduct(@PathVariable long id_prod) {
//        Product product = productService.findById(id_prod);
//        if (product == null) {
//            return new ResponseEntity(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity(product, HttpStatus.OK);
//    }

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
