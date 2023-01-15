package com.netshop.ecommerce.domain.dto;

import java.util.List;

public class BaseProductDTO {

    private int id;

    private String name;

    private String description;

    private double price;

    private double manufacturingTime;

    private List<PersonalizationAreaDTO> PersonalizationAreas;

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getManufacturingTime() {
        return manufacturingTime;
    }

    public void setManufacturingTime(double manufactirungTime) {
        this.manufacturingTime = manufactirungTime;
    }

    public List<PersonalizationAreaDTO> getPersonalizationAreas() {
        return PersonalizationAreas;
    }

    public void setPersonalizationAreas(List<PersonalizationAreaDTO> personalizationAreas) {
        PersonalizationAreas = personalizationAreas;
    }
}
