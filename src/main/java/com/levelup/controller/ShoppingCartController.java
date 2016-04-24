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
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
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
    @Autowired
    private ProductService productService;


    @RequestMapping(value = "/product/{id_prod}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity addCart(@PathVariable long id_prod, Model model, HttpServletRequest httpServletRequest) {

        Product productCart = productService.findById(id_prod);
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
        shoppingCartItem.setQuantity(1);
        shoppingCartItem.setProduct(productCart);

        ShoppingCart cart;
        httpSession = httpServletRequest.getSession(true);
        cart = (ShoppingCart) httpSession.getAttribute("cart");

        if (cart == null) {
            cart = new ShoppingCart();
            cart.addItem(shoppingCartItem);
            httpSession.setAttribute("cart", cart);
        } else {
            cart.addItem(shoppingCartItem);
            httpSession.setAttribute("cart", cart);
        }
        model.addAttribute("totalAmount", cart.getTotalAmount());
        model.addAttribute("totalCost", cart.getTotalCost());

        return new ResponseEntity(model, HttpStatus.OK);
    }

    @RequestMapping(value = "/productdel/{id_prod}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity delCart(@PathVariable long id_prod, Model model, HttpServletRequest httpServletRequest) {

        Product productCart = productService.findById(id_prod);
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
        shoppingCartItem.setQuantity(-1);
        shoppingCartItem.setProduct(productCart);

        ShoppingCart cart;
        httpSession = httpServletRequest.getSession(true);
        cart = (ShoppingCart) httpSession.getAttribute("cart");

        if (cart == null) {
            cart = new ShoppingCart();
            cart.addItem(shoppingCartItem);
            httpSession.setAttribute("cart", cart);
        } else {
            cart.addItem(shoppingCartItem);
            httpSession.setAttribute("cart", cart);
        }

        model.addAttribute("totalAmount", cart.getTotalAmount());
        model.addAttribute("totalCost", cart.getTotalCost());

        return new ResponseEntity(model, HttpStatus.OK);
    }


    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    public String checkout(Model model, HttpServletRequest httpServletRequest) {

        ShoppingCart cart;
        httpSession = httpServletRequest.getSession(true);
        cart = (ShoppingCart) httpSession.getAttribute("cart");
        if (cart == null) {
            cart = new ShoppingCart();
        }
        model.addAttribute("items", cart.getShoppingCartItem());
        model.addAttribute("totalAmount", cart.getTotalAmount());
        model.addAttribute("totalCost", cart.getTotalCost());
        return "shopping_cart";
    }


    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<ShoppingCart> info(Model model, HttpServletRequest httpServletRequest) {

        ShoppingCart cart;
        httpSession = httpServletRequest.getSession(true);
        cart = (ShoppingCart) httpSession.getAttribute("cart");
        if (cart == null) {
            cart = new ShoppingCart();
        }
        model.addAttribute("totalAmount", cart.getTotalAmount());
        model.addAttribute("totalCost", cart.getTotalCost());
        return new ResponseEntity(model, HttpStatus.OK);
    }


    @RequestMapping(value = "/{id_prod}", method = RequestMethod.POST, produces = "application/json")
    public ModelAndView remove(@PathVariable long id_prod, Model model, HttpServletRequest httpServletRequest) {

        ShoppingCart cart;
        httpSession = httpServletRequest.getSession(true);
        cart = (ShoppingCart) httpSession.getAttribute("cart");
        Product productCart = productService.findById(id_prod);

        List<ShoppingCartItem> carts = cart.getShoppingCartItem();
        Iterator<ShoppingCartItem> iter = carts.iterator();
        while (iter.hasNext()) {
            ShoppingCartItem item = iter.next();
            if (item.getProduct().getId_prod() == productCart.getId_prod()) {
                cart.removeItem(item);
            }
        }
        httpSession.setAttribute("cart", cart);
        model.addAttribute("items", cart.getShoppingCartItem());
        return new ModelAndView("redirect:checkout");
    }

}
