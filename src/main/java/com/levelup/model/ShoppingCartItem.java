package com.levelup.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Class {@link ShoppingCartItem}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 20.03.16
 */


@Component
@Scope("session")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShoppingCartItem {
    private Product product;
    private Integer quantity;


    public ShoppingCartItem() {
        quantity = new Integer(0);
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
        BigDecimal totalCost = this.getProduct().getPrice().multiply(new BigDecimal(this.getQuantity()));
        return totalCost;
    }

}
