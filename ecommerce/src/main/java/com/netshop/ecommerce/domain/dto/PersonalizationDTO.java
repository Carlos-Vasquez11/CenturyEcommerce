package com.netshop.ecommerce.domain.dto;

public class PersonalizationDTO {

    private int id;

    private Integer productId;

    private Integer personalizationAreaId;

    private String text;

    private String name;

    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getPersonalizationAreaId() {
        return personalizationAreaId;
    }

    public void setPersonalizationAreaId(Integer personalizationAreaId) {
        this.personalizationAreaId = personalizationAreaId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
