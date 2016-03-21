package com.levelup.model;

import java.math.BigDecimal;

/**
 * Class {@link ShoppingCartItem}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 20.03.16
 */

public class ShoppingCartItem {
    private Product product;
    private Integer quantity;



    public ShoppingCartItem() {
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public BigDecimal calculateTotalCost(){
        BigDecimal totalCost = new BigDecimal(Integer.valueOf(product.getPrice().intValue()) * quantity);
        return totalCost;
    }



//    public BigDecimal calculateTotalCost() {
//        BigDecimal totalCost = this.getProduct().getPrice().multiply(new BigDecimal(this.getQuantity()));
//        return totalCost;
//    }

}
