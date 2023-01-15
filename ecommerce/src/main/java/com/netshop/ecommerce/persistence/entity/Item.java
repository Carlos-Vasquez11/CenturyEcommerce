package com.netshop.ecommerce.persistence.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="item")
public class Item {
    //Columnas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "item_id")
    private Integer id;

    @Column(name = "compra_id")
    private Integer compraId;

    @Column(name = "prod_id")
    private Integer productoId;

    @Column(name = "item_cantidad")
    private int cantidad;

    //Relaciones
    @ManyToOne
    @JoinColumn(name = "compra_id", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "prod_id", insertable = false, updatable = false)
    private Producto producto;

    //GyS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompraId() {
        return compraId;
    }

    public void setCompraId(Integer compraId) {
        this.compraId = compraId;
    }

    public Integer getProductoId() {
        return productoId;
    }

    public void setProductoId(Integer productoId) {
        this.productoId = productoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}