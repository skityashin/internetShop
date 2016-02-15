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
    private long id_prod;
    private String title_prod;
    private String description;
    private double price;
    private int quantity;
    private Category category;
}
