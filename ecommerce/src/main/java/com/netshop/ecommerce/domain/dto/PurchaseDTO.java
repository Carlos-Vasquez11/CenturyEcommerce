package com.netshop.ecommerce.domain.dto;

import java.util.List;

public class PurchaseDTO {

    private int id;

    private int userId;

    private List<ItemDTO> items;

    //GyS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<ItemDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemDTO> items) {
        this.items = items;
    }

}
