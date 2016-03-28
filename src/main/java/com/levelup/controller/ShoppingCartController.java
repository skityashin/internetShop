package com.levelup.controller;

import com.levelup.model.Product;
import com.levelup.model.ShoppingCart;
import com.levelup.model.ShoppingCartItem;
import com.levelup.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Class {@link ShoppingCartController}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 20.03.16
 */

@Controller
@Scope(value = "session")
@RequestMapping("/cart")
public class ShoppingCartController {


    @Autowired
    private HttpSession httpSession;
    private ProductService productService;


    @RequestMapping(value = "/product/{id_prod}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity showCart(@PathVariable long id_prod, Model model, HttpServletRequest httpServletRequest) {
        Product productCart = productService.findById(id_prod);
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
        shoppingCartItem.setQuantity(productCart.getQuantity());
        shoppingCartItem.setProduct(productCart);
       httpSession = httpServletRequest.getSession(true);
        httpSession.setAttribute("cart", shoppingCartItem);
        ShoppingCart cart = (ShoppingCart) httpSession.getAttribute("cart");
        if (cart != null) {
            cart.addItem(shoppingCartItem);
            httpSession.setAttribute("cart", cart);
//            cart = (ShoppingCart) httpSession.getAttribute("cart");
        } else {
            cart = new ShoppingCart();
        }


//        Integer totalAmount = (Integer)session.getValue("tracker.count");
//        if (count == null)
//            count = new Integer(1);
//        else
//            count = new Integer(count.intValue() + 1);
//        session.putValue("tracker.count", count);
//
//
//        BigDecimal totalCost = new BigDecimal(httpServletRequest.getParameter("totalCost"));
//        Integer totalAmount = new Integer(httpServletRequest.getParameter("totalAmount"));
//        ShoppingCartItem sci = new ShoppingCartItem("cart", totalCost, totalAmount);
//        shoppingCartItem.add(sci);



        return new ResponseEntity(model, HttpStatus.OK);
    }

    //        List<Product> products = productService.getAllProduct();
//        model.addAttribute("products", products);
//        model.addAttribute("totalAmount", shoppingCart.getTotalAmount());
//        model.addAttribute("totalCost",  shoppingCart.getTotalCost());
//        "shopping_cart";


}
