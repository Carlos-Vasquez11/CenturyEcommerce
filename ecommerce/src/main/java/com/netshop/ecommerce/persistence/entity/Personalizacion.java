package com.netshop.ecommerce.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="personalizacion")
public class Personalizacion {

    //Columnas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name="pers_id")
    private Integer id;

    @Column(name="prod_id")
    private Integer productoId;

    @Column(name="aper_id")
    private Integer areaPersonalizacionId;

    @Column(name="pers_texto", nullable = true)
    private String texto;

    @Column(name= "pers_nombre")
    private String nombre;

    @Column(name="pers_precio")
    private long precio;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "prod_id",referencedColumnName = "prod_id",insertable = false,updatable = false)
    private Producto producto;

    @OneToOne
    @JoinColumn(name = "aper_id",referencedColumnName = "aper_id",insertable = false,updatable = false)
    private AreaPersonalizacion areaPersonalizacion;

    //Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public Integer getAreaPersonalizacionId() {
        return areaPersonalizacionId;
    }

    public void setAreaPersonalizacionId(Integer areaPersonalizacionId) {
        this.areaPersonalizacionId = areaPersonalizacionId;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String lugar) {
        this.texto = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precioPersonalizacion) {
        this.precio = precioPersonalizacion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public AreaPersonalizacion getAreaPersonalizacion() {
        return areaPersonalizacion;
    }

    public void setAreaPersonalizacion(AreaPersonalizacion areaPersonalizacion) {
        this.areaPersonalizacion = areaPersonalizacion;
    }
}