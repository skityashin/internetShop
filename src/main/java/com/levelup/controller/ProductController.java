package com.levelup.controller;

import com.levelup.dto.ProductDto;
import com.levelup.model.Product;
import com.levelup.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

        return new ResponseEntity(product, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity deleteProduct(@RequestBody ProductDto productDto) {
        if(productDto == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        deleteProduct(productDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity findProduct(@RequestBody ProductDto productDto) {
        if(productDto == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(findProduct(productDto), HttpStatus.OK);
    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity getAllProducts() {
        List<Product> products = productService.getAllProduct();
        if (CollectionUtils.isEmpty(products)) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(products, HttpStatus.OK);
    }


}
