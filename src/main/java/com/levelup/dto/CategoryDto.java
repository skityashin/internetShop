package com.levelup.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Class {@link com.levelup.dto.CategoryDto}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 17.02.16
 */

@JsonAutoDetect
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class CategoryDto {

    private String title_category;

    public String getTitle_category() {
        return title_category;
    }

    public void setTitle_category(String title_category) {
        this.title_category = title_category;
    }
}
