package com.levelup.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Class {@link ShoppingCart}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 20.03.16
 */

public class ShoppingCart {
    private List<ShoppingCartItem> shoppingCartItem;
    private BigDecimal totalCost = BigDecimal.valueOf(0);
    private Integer totalAmount = 0;

    public ShoppingCart() {
        shoppingCartItem = new CopyOnWriteArrayList<ShoppingCartItem>();
    }

    public List<ShoppingCartItem> getShoppingCartItem() {
        return shoppingCartItem;
    }

    public void setShoppingCartItem(List<ShoppingCartItem> shoppingCartItem) {
        this.shoppingCartItem = shoppingCartItem;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void addItem(ShoppingCartItem items){
        for (ShoppingCartItem item: shoppingCartItem) {
            if (item.getProduct().equals(items)){
                item.setQuantity(item.getQuantity() + items.getQuantity());
            }
        }
        recalcTotalCostAndAmount();
    }

    public void removeItem(ShoppingCartItem items){
        shoppingCartItem.remove(items);
        recalcTotalCostAndAmount();
    }

    public void recalcTotalCostAndAmount(){
        for (ShoppingCartItem item: shoppingCartItem) {
            totalCost = totalCost.add(item.calculateTotalCost());
            totalAmount += item.getQuantity();
        }


    }


}
