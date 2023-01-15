package com.netshop.ecommerce.domain.dto;

import java.util.List;

public class ProductDTO {

    private int id;

    private int baseProductId;

    private String photoUrl;

    private BaseProductDTO baseProduct;

    private List<PersonalizationDTO> personalizations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BaseProductDTO getBaseProduct() {
        return baseProduct;
    }

    public void setBaseProduct(BaseProductDTO baseProduct) {
        this.baseProduct = baseProduct;
    }

    public List<PersonalizationDTO> getPersonalizations() {
        return personalizations;
    }

    public void setPersonalizations(List<PersonalizationDTO> personalizations) {
        this.personalizations = personalizations;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getBaseProductId() {
        return baseProductId;
    }

    public void setBaseProductId(int baseProductId) {
        this.baseProductId = baseProductId;
    }
}
