package com.levelup.dto;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.math.BigDecimal;

/**
 * Class {@link com.levelup.dto.ProductDto}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 15.02.16
 */

@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ProductDto {

    private String title_prod;
    private BigDecimal price;
    private int quantity;

    public String getTitle_prod() {
        return title_prod;
    }

    public void setTitle_prod(String title_prod) {
        this.title_prod = title_prod;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
