package com.netshop.ecommerce.domain.dto;

import java.util.List;

public class ShopDTO {

    //Atributes
    private int id;

    private String name;

    private String bannerUrl;

    private List<PublicationDTO> publications;

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String banneUrl) {
        this.bannerUrl = banneUrl;
    }

    public List<PublicationDTO> getPublications() {
        return publications;
    }

    public void setPublications(List<PublicationDTO> publications) {
        this.publications = publications;
    }
}
