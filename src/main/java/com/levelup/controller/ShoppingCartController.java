package com.levelup.controller;

import com.levelup.model.Product;
import com.levelup.model.ShoppingCart;
import com.levelup.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;
import java.util.List;

/**
 * Class {@link ShoppingCartController}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 20.03.16
 */

@Controller
@RequestMapping("/cart")
public class ShoppingCartController {


    @Autowired
    private ProductService productService;
    private ShoppingCart shoppingCart;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public String showCart(Model model) {
        List<Product> products = productService.getAllProduct();
        model.addAttribute("products", products);
        model.addAttribute("totalAmount", shoppingCart.getTotalAmount());
        model.addAttribute("totalCost",  shoppingCart.getTotalCost());

        return "shopping_cart";
    }


}
