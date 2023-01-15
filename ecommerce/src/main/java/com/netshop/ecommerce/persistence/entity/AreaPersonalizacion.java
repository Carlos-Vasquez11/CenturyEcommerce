package com.netshop.ecommerce.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="area_personalizacion")
public class AreaPersonalizacion {

    //Columnas

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Permite que JAVA genere de manera automatica el autoIncrement
    @NotNull
    @Column(name="aper_id")
    private Integer id;

    @Column(name="prodb_id")
    private Integer productoBaseId;

    @Column(name="aper_lugar")
    private String lugar;

    //Relaciones
    @ManyToOne
    @JoinColumn(name="prodb_id", insertable = false , updatable = false)
    private ProductoBase productoBase;

    //Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductoBaseId() {
        return productoBaseId;
    }

    public void setProductoBaseId(Integer productoBaseId) {
        this.productoBaseId = productoBaseId;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ProductoBase getProductoBase() {
        return productoBase;
    }

    public void setProductoBase(ProductoBase productoBase) {
        this.productoBase = productoBase;
    }
}
