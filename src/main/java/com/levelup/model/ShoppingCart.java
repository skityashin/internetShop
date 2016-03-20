package com.levelup.model;

import java.util.List;

/**
 * Class {@link ShoppingCart}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 20.03.16
 */

public class ShoppingCart {
    private ShoppingCartItem shoppingCartItem;

    public ShoppingCart() {
    }


    public ShoppingCartItem getShoppingCartItem() {
        return shoppingCartItem;
    }

    public void setShoppingCartItem(ShoppingCartItem shoppingCartItem) {
        this.shoppingCartItem = shoppingCartItem;
    }




}
