package com.netshop.ecommerce.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(name="tienda")
public class Tienda {

    //Columnas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name="tienda_id")
    private Integer id;

    @Column(name="tienda_nombre")
    private String nombre;

    @Column(name="tienda_banner_url")
    private String bannerUrl;

    //Relaciones
    @OneToMany(mappedBy = "tienda")
    private List<Publicacion> publicaciones;

    //Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }
}
