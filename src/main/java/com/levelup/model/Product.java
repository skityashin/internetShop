package com.levelup.model;


import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Class {@link com.levelup.model.Product}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 10.02.16
 */

@Entity
@Table(name = "product")
@NamedQuery(name = "Product.getALL", query = "select p from Product p")

public class Product {

    private long id_prod;
    private String title_prod;
    private String description;
    private BigDecimal price;
    private int quantity;
    private Category category;


    public Product() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_prod", nullable = false)
    public long getId_prod() {
        return id_prod;
    }

    public void setId_prod(long id_prod) {
        this.id_prod = id_prod;
    }


    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Column(name="title_prod")
    public String getTitle_prod() {
        return title_prod;
    }

    public void setTitle_prod(String title_prod) {
        this.title_prod = title_prod;
    }


    @ManyToOne
    @JoinColumn(name = "category_id")
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
