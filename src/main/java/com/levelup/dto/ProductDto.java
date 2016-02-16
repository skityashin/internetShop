package com.levelup.dto;

import com.levelup.model.Category;

/**
 * Class {@link com.levelup.dto.ProductDto}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

public class ProductDto {

    private String title_prod;
    private double price;
    private int quantity;

    public String getTitle_prod() {
        return title_prod;
    }

    public void setTitle_prod(String title_prod) {
        this.title_prod = title_prod;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
