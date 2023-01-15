package com.netshop.ecommerce.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="publicacion")
public class Publicacion {

    //Columnas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name="publ_id")
    private Integer id;

    @Column(name="tienda_id")
    private Integer tiendaId;

    @Column(name="prod_id")
    private Integer productoId;

    @Column(name="publ_activa")
    private boolean activa;

    @Column(name="publ_cantidad")
    private long cantidad;

    //Relaciones
    @OneToOne
    @JoinColumn(name = "prod_id",referencedColumnName = "prod_id",insertable = false,updatable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "tienda_id",insertable = false,updatable = false, nullable = true)
    private Tienda tienda;

    //Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTiendaId() {
        return tiendaId;
    }

    public void setTiendaId(Integer tiendaId) {
        this.tiendaId = tiendaId;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
}

